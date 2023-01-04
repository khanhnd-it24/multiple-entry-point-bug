package com.example.android_module

import android.content.Context
import android.os.Bundle
import android.util.Log
import io.flutter.FlutterInjector
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.android.FlutterActivityLaunchConfigs
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.embedding.engine.FlutterEngineCache
import io.flutter.embedding.engine.dart.DartExecutor

class MyFlutterActivity: FlutterActivity() {
    private val SCREEN_ENGINE_ID = "screenEngineId"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        flutterEngine?.dartExecutor?.executeDartEntrypoint(
            DartExecutor.DartEntrypoint(
                FlutterInjector.instance().flutterLoader().findAppBundlePath(),
                "package:flutter_module/main.dart",
                "main_1"
            )
        )

    }

    override fun getBackgroundMode(): FlutterActivityLaunchConfigs.BackgroundMode {
        return FlutterActivityLaunchConfigs.BackgroundMode.transparent
    }

    override fun provideFlutterEngine(context: Context): FlutterEngine? {
        Log.d("TEST", "provideFlutterEngine: ")
        return FlutterEngineCache.getInstance()[SCREEN_ENGINE_ID]
    }
}