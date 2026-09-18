# Module 8: Add a Button to an App

## Pathway Reference
**Pathway:** https://developer.android.com/courses/pathways/android-basics-compose-unit-2-pathway-2
**Unit:** 2 — Building app UI
**Pathway:** 2 — Add a button to an app

---

## Codelabs Completed

| # | Title | Type | URL |
|---|---|---|---|
| 1 | Intro to Dice Roller app | Video | — |
| 2 | Create an interactive Dice Roller app | Codelab | https://developer.android.com/codelabs/basic-android-kotlin-compose-build-a-dice-roller-app |
| 3 | Use the debugger in Android Studio | Codelab | https://developer.android.com/codelabs/basic-android-kotlin-compose-intro-debugger |
| 4 | Practice: Click behavior | Codelab | https://developer.android.com/codelabs/basic-android-kotlin-compose-button-click-practice-problem |
| 5 | What's next? | Video | — |
| 6 | Quiz | Quiz | https://developer.android.com/courses/quizzes/android-basics-compose-unit-2-pathway-2/android-basics-compose-unit-2-pathway-2 |

---

## What I Learned

### Key Concepts
- **`remember { mutableStateOf(...) }`** creates observable state that survives recomposition; reassigning it (via the `by` delegate) automatically triggers Compose to redraw affected composables.
- **`Button`** takes an `onClick` lambda; tapping it is the trigger that updates state.
- The **`clickable` modifier** turns any composable (e.g. an `Image`) into a tappable target, which is how the Lemonade app advances through its four steps.
- **Recomposition** is Compose re-running composable functions when the state they read changes — understanding this is essential once UI needs to react to input.
- The **debugger** (breakpoints, step over/into, the Variables pane) is the tool for inspecting state values at runtime rather than relying only on `println`/Logcat.

### State Flow (Dice Roller)
1. `result` starts at `1`, held in `remember { mutableStateOf(1) }`.
2. A `when` expression maps `result` to the matching `R.drawable.dice_N`.
3. Tapping the `Button` sets `result = (1..6).random()`, which triggers recomposition and swaps the displayed image.

### State Flow (Lemonade — click practice)
The Lemonade app models a 4-step flow (select → squeeze → drink → restart) using two pieces of state: `currentStep` (which screen is shown) and `squeezeCount`/`squeezeTarget` (a random 2–4 taps required before the lemon becomes lemonade). Each step is rendered by the same reusable `LemonTextAndImage` composable, parameterized by text, image, and an `onImageClick` lambda.

---

## Source Files

| Project | Description |
|---|---|
| `DiceRollerApp/` | Tap a button to roll a random 1–6 and update the displayed die face image |
| `LemonadeApp/` | Practice: Click behavior — a 4-step tap-driven flow (lemon tree → squeeze → drink → restart) |

---

## Challenges Completed
✅ Built the interactive Dice Roller app with `remember`/`mutableStateOf`
✅ Practiced using the Android Studio debugger to step through state changes
✅ Completed the Click Behavior practice problem (Lemonade app)

---

## Reflection
This pathway is the first real introduction to **interactivity** in Compose: state plus a click handler is the pattern behind almost every interactive screen from here on. The Lemonade app's random "squeeze count" was a good exercise in combining `remember` state with conditional logic inside a click handler, rather than just toggling a single value.
