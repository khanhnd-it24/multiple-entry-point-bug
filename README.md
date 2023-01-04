- Flutter SDK: 2.8.0

```
- cd flutter_module
- flutter pub get
- flutter build aar --no-profile
```

Bugs:
- When flutter engine run with dartEntrypointLibrary => MissingPluginException
- When flutter engine run without dartEntrypointLibrary => not working in release mode.