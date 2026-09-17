# 📱 Mobile Development Learning Portfolio

**Android Basics with Compose — Google Android Developers**

This repository is my learning portfolio for the **Android Basics with Compose** course. It documents every module I complete — Kotlin fundamentals, Jetpack Compose UI, state management, and full Android Studio projects — with source code, screenshots, badge evidence, and a written analysis for each.

---

## 👤 Student Information

| Field      | Details                              |
| ---------- | ------------------------------------ |
| Name       | Abdulaziz Taju Mohammedyasin         |
| Student ID | AIU24102453                          |
| University | _ALBUKHARY INTERNATIONAL UNIVERSITY_ |
| Programme  | _BACHELOR IN COMPUTER SCIENCE_       |

---

## 🎓 Course Information

| Field       | Details                                                             |
| ----------- | ------------------------------------------------------------------- |
| Course      | Android Basics with Compose                                         |
| Provider    | Google Android Developers                                           |
| Course link | https://developer.android.com/courses/android-basics-compose/course |
| Language    | Kotlin                                                              |
| Tools       | Android Studio, Jetpack Compose, Gradle                             |

---

## 📋 Assessment Overview

This repository serves as **continuous assessment evidence** for the Android Basics with Compose course. Each module below corresponds to one pathway (or group of codelabs within a pathway) from the official course, and contains:

- **Source Code** — the actual Kotlin/Compose files or full Android Studio project for that pathway's codelabs
- **Screenshots** — evidence the code was run and produces the expected result
- **Badge Evidence** — proof the pathway quiz was completed on developer.android.com
- **Analysis.md** — a written breakdown of the concepts covered, the codelabs completed, and what was learned

The portfolio currently covers **Unit 1 (Your First Android App)** and **Unit 2 (Building App UI)** in full, across 9 modules.

---

## 📂 Repository Structure

```
mobile-development/
├── README.md
│
├── Module-1/                         ← Codelab: Your First Program in Kotlin
│   ├── Source Code/
│   │   ├── 01_hello_world.kt         ← Hello World + print vs println
│   │   └── 02_multiple_messages.kt   ← Multiple println challenge
│   ├── Screenshots/
│   ├── Badge Evidence/
│   └── Analysis.md
│
├── Module-2/                         ← Codelab: Create and Use Variables in Kotlin
│   ├── Source Code/
│   │   ├── 01_variables_basics.kt    ← val/var with explicit types
│   │   ├── 02_variables_update.kt    ← Updating var with operators
│   │   └── 03_variables_types.kt     ← Type inference & data types
│   ├── Screenshots/
│   ├── Badge Evidence/
│   └── Analysis.md
│
├── Module-3/                         ← Codelab: Create and Use Functions in Kotlin
│   ├── Source Code/
│   │   ├── 01_functions_basics.kt    ← Define & call a function
│   │   ├── 02_functions_parameters.kt← Parameters & return values
│   │   └── 03_functions_named_args.kt← Named args & default params
│   ├── Screenshots/
│   ├── Badge Evidence/
│   └── Analysis.md
│
├── Module-4/                         ← Practice: Kotlin Basics
│   ├── Source Code/
│   │   ├── 01_print_messages.kt      ← Challenge 1: Print Messages
│   │   ├── 02_fix_compile_errors.kt  ← Challenge 2: Fix Compile Errors
│   │   ├── 03_string_templates.kt    ← Challenge 3: String Templates
│   │   └── 04_notification_summary.kt← Challenge 4: Notification Program
│   ├── Screenshots/
│   ├── Badge Evidence/
│   └── Analysis.md
│
├── Module-5/                         ← Pathway: Setup Android Studio
│   ├── Source Code/
│   │   └── MyFirstApp/                    ← Full Android Studio Compose project
│   ├── Screenshots/
│   ├── Badge Evidence/
│   └── Analysis.md
│
├── Module-6/                         ← Pathway: Build a Basic Layout
│   ├── Source Code/
│   │   ├── BirthdayCardApp/               ← Text composables + background image
│   │   ├── ComposeQuadrantApp/            ← Practice: Compose Basics (Quadrant app)
│   │   └── BusinessCardApp/               ← Project: Business Card app
│   ├── Screenshots/
│   ├── Badge Evidence/
│   └── Analysis.md
│
├── Module-7/                         ← Pathway: Kotlin Fundamentals
│   ├── Source Code/
│   │   ├── 01_conditionals.kt        ← if/else, when
│   │   ├── 02_nullability.kt         ← ?., !!, ?:
│   │   ├── 03_classes_objects.kt     ← Inheritance, property delegation
│   │   ├── 04_function_types_lambdas.kt ← Function types, lambdas
│   │   └── 05_practice_kotlin_fundamentals.kt ← 7 practice challenges
│   ├── Screenshots/
│   ├── Badge Evidence/
│   └── Analysis.md
│
├── Module-8/                         ← Pathway: Add a Button to an App
│   ├── Source Code/
│   │   ├── DiceRollerApp/                 ← Interactive Dice Roller app
│   │   └── LemonadeApp/                   ← Practice: Click behavior
│   ├── Screenshots/
│   ├── Badge Evidence/
│   └── Analysis.md
│
├── Module-9/                         ← Pathway: Interacting with UI and State
│   ├── Source Code/
│   │   ├── TipTimeApp/                    ← Tip calculator + unit/UI tests
│   │   └── ArtSpaceApp/                   ← Project: Art Space app
│   ├── Screenshots/
│   ├── Badge Evidence/
│   └── Analysis.md
│
├── Reflection/
│   └── Reflection.md
│
├── References/
└── Assets/
```

---

## 🚀 How to Run

**Modules 1–4 and 7** are pure Kotlin console files and can be run in:

1. **[Kotlin Playground](https://play.kotlinlang.org/)** — Paste the code online and click ▶ Run
2. **IntelliJ IDEA** — Open as a Kotlin project and run `main()`
3. **Gradle**, from inside the module folder: `./gradlew.bat run<ExerciseName>` (e.g. `./gradlew.bat runConditionals` in `Module-7`) — see each module's `build.gradle.kts` for the full list of tasks

**Modules 5, 6, 8, and 9** contain full Android Studio / Jetpack Compose projects. Open any app folder under a module's `Source Code/` directory directly in Android Studio (`File > Open`) and run it on an emulator or device, or from the command line inside that app's folder: `./gradlew.bat assembleDebug`.

---

## ✅ Learning Modules Completed

| Module   | Pathway / Codelab                  | Unit | Status      |
| -------- | ---------------------------------- | ---- | ----------- |
| Module 1 | Your First Program in Kotlin       | 1    | ✅ Complete |
| Module 2 | Create and Use Variables in Kotlin | 1    | ✅ Complete |
| Module 3 | Create and Use Functions in Kotlin | 1    | ✅ Complete |
| Module 4 | Practice: Kotlin Basics            | 1    | ✅ Complete |
| Module 5 | Setup Android Studio               | 1    | ✅ Complete |
| Module 6 | Build a Basic Layout               | 1    | ✅ Complete |
| Module 7 | Kotlin Fundamentals                | 2    | ✅ Complete |
| Module 8 | Add a Button to an App             | 2    | ✅ Complete |
| Module 9 | Interacting with UI and State      | 2    | ✅ Complete |

---

## 🏅 Badges Obtained

Each pathway on developer.android.com awards a badge after passing its quiz. Evidence is stored in each module's `Badge Evidence/` folder.

| Module   | Pathway                               | Badge Evidence |
| -------- | ------------------------------------- | -------------- |
| Module 1 | Introduction to Programming in Kotlin | ⏳ Pending     |
| Module 2 | Introduction to Programming in Kotlin | ✅ Added       |
| Module 3 | Introduction to Programming in Kotlin | ✅ Added       |
| Module 4 | Introduction to Programming in Kotlin | ⏳ Pending     |
| Module 5 | Setup Android Studio                  | ⏳ Pending     |
| Module 6 | Build a Basic Layout                  | ⏳ Pending     |
| Module 7 | Kotlin Fundamentals                   | ⏳ Pending     |
| Module 8 | Add a Button to an App                | ⏳ Pending     |
| Module 9 | Interacting with UI and State         | ⏳ Pending     |

---

## 🔗 GitHub Repository

- **Repository:** https://github.com/abcd001100/mobile-development
- **Owner:** Abdulaziz Taju
- **Branch:** `main`
- **Visibility:** Public

Commits are organized module by module (source code and screenshots committed separately for clarity), so the commit history itself is a timeline of progress through the course.

---

## 💭 Reflection Summary

A full written reflection is available in [`Reflection/Reflection.md`](Reflection/Reflection.md). In short: starting with plain Kotlin (`val`/`var`, functions, conditionals, nullability, classes) before touching Jetpack Compose made the jump into UI code much smoother — composables are just functions, and `remember { mutableStateOf(...) }` is the same mental model as any other variable, just observed by the UI. Building small, complete apps (Business Card, Dice Roller, Tip Time, Art Space) rather than only isolated exercises was the most effective way to see how variables, functions, state, and layout composables fit together in a real app.

---

## 🛠️ Technologies Used

- Kotlin
- Jetpack Compose
- Android Studio
- Android SDK / Gradle
- Git & GitHub

---

## 📊 Project Status

**Status:** 🚧 In Progress — Units 1–2 complete, continuing through the rest of the course.
