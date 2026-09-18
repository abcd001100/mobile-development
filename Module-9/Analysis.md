# Module 9: Interacting with UI and State

## Pathway Reference
**Pathway:** https://developer.android.com/courses/pathways/android-basics-compose-unit-2-pathway-3
**Unit:** 2 — Building app UI
**Pathway:** 3 — Interacting with UI and state

---

## Codelabs Completed

| # | Title | Type | URL |
|---|---|---|---|
| 1 | Understanding state in Compose | Video | — |
| 2 | Intro to tip calculator | Video | — |
| 3 | Intro to state in Compose | Codelab | https://developer.android.com/codelabs/basic-android-kotlin-compose-using-state |
| 4 | Calculate a custom tip | Codelab | https://developer.android.com/codelabs/basic-android-kotlin-compose-calculate-tip |
| 5 | Write automated tests | Codelab | https://developer.android.com/codelabs/basic-android-kotlin-compose-write-automated-tests |
| 6 | Project: Create an Art Space app | Codelab | https://developer.android.com/codelabs/basic-android-kotlin-compose-art-space |
| 7 | What's next? | Video | — |
| 8 | Quiz | Quiz | https://developer.android.com/courses/quizzes/android-basics-compose-unit-2-pathway-3/android-basics-compose-unit-2-pathway-3 |

---

## What I Learned

### State Hoisting
- **State hoisting** moves `remember { mutableStateOf(...) }` out of a child composable and up to its caller, passing the current value down and an `onValueChange`/`onCheckedChange` lambda back up.
- This turns the child into a **stateless**, reusable composable (`EditNumberField`, `RoundTheTipRow`) that doesn't own any state itself — the same pattern Compose uses throughout its own APIs (`TextField`, `Switch`).

### Tip Time App
- `TextField` accepts `keyboardOptions` (`KeyboardType.Number`, `ImeAction.Next`/`Done`) to control the on-screen keyboard.
- `Switch` toggles a `Boolean` (`roundUp`) via `checked`/`onCheckedChange`.
- `calculateTip()` is a pure function — no Compose/Android dependency — which is exactly what makes it straightforward to unit test:

```kotlin
private fun calculateTip(amount: Double, tipPercent: Double = 15.0, roundUp: Boolean): String {
    var tip = tipPercent / 100 * amount
    if (roundUp) tip = kotlin.math.ceil(tip)
    return NumberFormat.getCurrencyInstance().format(tip)
}
```

### Automated Tests
- **Local unit tests** (`app/src/test`) run on the JVM and test plain Kotlin logic like `calculateTip()` — fast, no emulator required. Assertion: `assertEquals(expected, actual)`.
- **Instrumentation (UI) tests** (`app/src/androidTest`) run on a device/emulator using `createComposeRule()`, simulate user input with `performTextInput`, and assert on what's rendered with `onNodeWithText(...).assertExists()`.

### Art Space Project
The Art Space project was a **guided, low-scaffolding** project: build the composable structure (artwork image, title/artist/year text, previous/next buttons) and decide the state design myself. I modeled the gallery as a fixed list of `Artwork` data objects and a single `currentIndex` state variable, wrapping around with modulo-style `if` checks on the Previous/Next button clicks.

---

## Source Files

| Project | Description |
|---|---|
| `TipTimeApp/` | Bill amount + tip percentage inputs and a round-up `Switch`, with local (`src/test`) and instrumentation (`src/androidTest`) tests for `calculateTip()` |
| `ArtSpaceApp/` | Gallery of 3 original artworks with title/artist/year and Previous/Next navigation buttons |

---

## Challenges Completed
✅ Learned state hoisting and stateless vs. stateful composables
✅ Built the Tip Time calculator with `TextField`, `Switch`, and keyboard actions
✅ Wrote a local unit test and a Compose UI test for `calculateTip()`
✅ Built the Art Space project end-to-end from a guided, low-instruction spec

---

## Reflection
State hoisting was the key mental model in this pathway — separating "who owns the state" from "who displays it" is what makes composables reusable and testable. Writing an actual unit test for `calculateTip()` also reinforced why keeping business logic in plain Kotlin functions (rather than buried inside a composable) pays off: it can be tested without touching Compose or Android at all.
