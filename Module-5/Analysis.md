# Module 5: Setup Android Studio

## Codelabs Completed

| #   | Title                                      | Type    | URL                                                                                                                           |
| --- | ------------------------------------------ | ------- | ----------------------------------------------------------------------------------------------------------------------------- |
| 1   | Introduction to Android Studio             | Video   | https://developer.android.com/studio/intro                                                                                    |
| 2   | Download and install Android Studio        | Codelab | https://developer.android.com/codelabs/basic-android-kotlin-compose-install-android-studio                                    |
| 3   | Create your first Android app              | Codelab | https://developer.android.com/codelabs/basic-android-kotlin-compose-first-app                                                 |
| 4   | Run your first app on the Android Emulator | Codelab | https://developer.android.com/codelabs/basic-android-kotlin-compose-emulator                                                  |
| 5   | How to connect your Android device         | Codelab | https://developer.android.com/codelabs/basic-android-kotlin-compose-connect-device                                            |
| 6   | What's next?                               | Video   | —                                                                                                                             |
| 7   | Quiz                                       | Quiz    | https://developer.android.com/courses/quizzes/android-basics-compose-unit-1-pathway-2/android-basics-compose-unit-1-pathway-2 |

---

## What I Learned

### Key Concepts

- **Android Studio** is the official IDE for Android development, built on IntelliJ IDEA, and bundles the Android SDK, an emulator manager, and Gradle build tooling.
- A new project is generated from a **template** (Empty Activity) that already wires up Jetpack Compose, a `MainActivity`, and a Material 3 theme package (`ui/theme`).
- **Gradle** (via `build.gradle.kts` files and the version catalog in `gradle/libs.versions.toml`) manages dependencies and build configuration for the app module.
- The **Android Emulator** (AVD Manager) lets you run and test an app without a physical device by emulating a virtual Android device.
- A **physical device** can also be used for testing after enabling Developer Options and USB debugging, then connecting it to Android Studio.

### Project Anatomy

| File/Folder                                | Purpose                                                                   |
| ------------------------------------------ | ------------------------------------------------------------------------- |
| `MainActivity.kt`                          | Entry point `Activity` that calls `setContent { }` to host the Compose UI |
| `ui/theme/Theme.kt`, `Color.kt`, `Type.kt` | Material 3 theming (color scheme, typography)                             |
| `AndroidManifest.xml`                      | Declares the app's components, permissions, and launcher activity         |
| `build.gradle.kts` (app)                   | Module-level build config: `namespace`, SDK versions, dependencies        |
| `gradle/libs.versions.toml`                | Central version catalog for plugins and libraries                         |

---

## Source Files

| Project       | Description                                                                                                                                          |
| ------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `MyFirstApp/` | The first Android Studio project created from the Empty Activity template — a Compose app that displays `Hello Android!` via a `Greeting` composable |

---

## Challenges Completed

✅ Installed Android Studio and accepted the Android SDK licenses
✅ Created a new Compose project from the Empty Activity template
✅ Ran the app on the Android Emulator
✅ Learned how to connect and run on a physical Android device

---

## Reflection

This pathway was less about writing new Kotlin and more about getting the toolchain working end to end: IDE, SDK, emulator, and the Gradle build. Understanding the generated project structure — especially how `MainActivity` calls into a `@Composable` function — is the foundation every later Compose app in this course builds on.
