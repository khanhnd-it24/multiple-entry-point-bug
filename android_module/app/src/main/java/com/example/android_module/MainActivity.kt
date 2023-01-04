package com.example.android_module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn: Button = findViewById(R.id.start_flutter_activity)
        var btn2: Button = findViewById(R.id.start_flutter_activity_2)

        btn.setOnClickListener {
            var intent = Intent(this, MyFlutterActivity::class.java)
            startActivity(intent)
        }

        btn2.setOnClickListener {
            var intent = Intent(this, MyFlutterActivity2::class.java)
            startActivity(intent)
        }
    }
}