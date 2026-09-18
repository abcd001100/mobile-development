# Reflection — Android Basics with Compose (Units 1 & 2)

## Overview

This reflection covers what I learned across all 9 modules completed so far in the Android Basics with Compose course: Unit 1 (Your First Android App — Modules 1–6) and Unit 2 (Building App UI — Modules 7–9).

---

## What I Learned

### Module 1 — Your First Program in Kotlin

My first encounter with Kotlin programming. I learned that:

- Every Kotlin program starts with `fun main()` — the entry point
- `println()` prints with a newline, `print()` does not
- String literals require double quotes

This module showed me that Kotlin syntax is clean and minimal compared to some other languages.

---

### Module 2 — Variables in Kotlin

I learned the fundamental difference between `val` (immutable) and `var` (mutable). Key takeaway:

> **Always use `val` unless you know the value will change.** This is a Kotlin best practice that prevents bugs.

Kotlin's type inference means I rarely need to write `val name: String = "Android"` — `val name = "Android"` works just as well. String templates (`$variable` and `${expression}`) make string formatting clean and readable.

---

### Module 3 — Functions in Kotlin

Functions are the true power of Kotlin. I learned:

- How to define reusable functions with parameters and return types
- **Default parameter values** reduce function overloading
- **Named arguments** make code self-documenting and flexible

The ability to name arguments when calling functions (e.g., `greet(name = "Android")`) is something I wish more languages made this easy.

---

### Module 4 — Practice: Kotlin Basics

Applying the concepts to real challenges reinforced my understanding significantly. The **Notification Summary** challenge was particularly useful — it showed how functions + conditionals + string templates work together in a real-world scenario (like Android's notification shade).

---

### Module 5 — Setup Android Studio

This module was less about writing new Kotlin and more about getting the whole toolchain working end to end: installing Android Studio, accepting SDK licenses, creating a project from the Empty Activity template, and running it on the Android Emulator. Seeing the generated project structure for the first time — `MainActivity.kt`, the `ui/theme` package, `AndroidManifest.xml`, and Gradle's `libs.versions.toml` version catalog — made it clear how much scaffolding Android Studio sets up automatically. Understanding that `MainActivity` just calls `setContent { }` to hand off to a `@Composable` function was the key insight that connects this module to everything after it.

---

### Module 6 — Build a Basic Layout

This is where Compose started to feel like real UI programming. Building the Birthday Card app taught me `Text`, `Column`, and styling modifiers (`fontSize`, `lineHeight`, `textAlign`); adding the background image introduced `Box` for stacking composables and `Modifier.matchParentSize()` so a child actually fills its parent instead of just wrapping its own content. The Compose Quadrant practice problem was a good lesson in the `weight` modifier for dividing a `Row`/`Column` into equal parts. The Business Card project pulled it together — the biggest takeaway was extracting a reusable `ContactRow` composable instead of repeating the same `Row` three times with different values.

**Debugging note:** while testing my own screenshots, I caught two real bugs this way — a background image that didn't actually cover the screen (a missing `fillMaxSize`/`matchParentSize` modifier) and a business card logo import that had a typo (`layout.sizezss` instead of `layout.size`). Both only showed up once I actually ran the apps and looked at the output, which reinforced that "it compiles" and "it looks right" are two different checks.

---

### Module 7 — Kotlin Fundamentals

This pathway is the "advanced Kotlin" companion to Unit 1's introduction, and it maps directly onto Compose idioms I'd already been using without fully understanding them:

- `if/else` and `when` as **expressions** (not just statements) — the same pattern used to pick a color or a string based on state
- Nullable types and the `?.` / `!!` / `?:` operators — essential once user input (which is always potentially empty) is involved
- Classes, inheritance, and property delegation, using a smart-home example with `open`/`override` and a custom `RangeRegulator` delegate
- Function types and lambdas, including trailing lambda syntax — realizing that `Column { ... }` in Compose _is_ a trailing lambda made a lot of earlier code make more sense in hindsight

The practice problems (temperature converter, song catalog, foldable phones, special auction) were a good forcing function to combine all of these in one file instead of practicing each concept in isolation.

---

### Module 8 — Add a Button to an App

This module introduced real interactivity: `remember { mutableStateOf(...) }` for state that survives recomposition, and either a `Button`'s `onClick` or the `clickable` modifier to trigger a state change. The Dice Roller app is a clean minimal example — one state variable, one `when` expression mapping it to a drawable, one button. The Lemonade click-behavior practice problem was more interesting because it combines two pieces of state (`currentStep` and a random `squeezeCount`/`squeezeTarget`) to drive a 4-step flow through the same reusable composable. I also got hands-on practice with the Android Studio debugger, which is a very different (and often faster) way to inspect state than sprinkling `println`/log statements everywhere.

---

### Module 9 — Interacting with UI and State

**State hoisting** was the key idea here: moving state ownership out of a child composable (like a `TextField` wrapper) and up to its caller, so the child becomes stateless and reusable. Building Tip Time made this concrete — `EditNumberField` and `RoundTheTipRow` don't own any state themselves, they just receive a value and an `onValueChange`/`onCheckedChange` lambda, exactly like Compose's own `TextField` and `Switch`. Writing an actual local unit test for `calculateTip()` and a Compose UI test for the full screen also reinforced _why_ keeping business logic in a plain Kotlin function separate from the composable pays off — it can be tested without touching Compose at all. The Art Space project was the first genuinely open-ended assignment in the course: given only a rough spec (image, title/artist/year, next/previous buttons), I had to decide the state design myself, which I modeled as a list of artwork objects plus a single `currentIndex`.

**Debugging note:** the Art Space app initially rendered as a solid black screen on the emulator with no crash in Logcat. The cause turned out to be `Modifier.shadow(elevation = 8.dp)` triggering a known rendering issue on this emulator's GPU backend. Switching to Compose Material 3's built-in `Surface(shadowElevation = ...)` parameter fixed it — a good reminder that a silent black screen doesn't always mean a crash, and that Compose's own component APIs are often the safer choice over a raw `Modifier`.

---

## Challenges & How I Overcame Them

| Challenge                                        | Solution                                                                                                                                                                                                             |
| ------------------------------------------------ | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Remembering `val` vs `var`                       | Mental model: `val` = value (fixed), `var` = variable (changing)                                                                                                                                                     |
| String templates with expressions                | Use `${}` curly braces for anything beyond simple variable names                                                                                                                                                     |
| Named vs positional arguments                    | Named args = more readable; positional = order must match definition                                                                                                                                                 |
| A child composable not filling its parent        | Remember that a `Box`'s children size themselves independently — use `fillMaxSize()`/`matchParentSize()` explicitly, don't assume it's automatic                                                                     |
| Nullable types feeling verbose at first          | Learned to reach for `?:` (Elvis) for defaults and reserve `!!` only for cases I'm certain aren't null                                                                                                               |
| State "not updating" the UI                      | Traced back to forgetting `remember`/`mutableStateOf` — a plain `var` doesn't trigger recomposition                                                                                                                  |
| A composable rendering solid black with no crash | Learned to check Logcat first (no crash = a rendering/graphics issue, not a logic bug) and to prefer built-in component parameters (like `Surface`'s `shadowElevation`) over raw modifiers when something misbehaves |

---

## Connection to Android Development

Everything in these two units connects directly to building real Android apps with Jetpack Compose:

- `println()` → `Text()` composable (displaying text on screen)
- Variables → State in Compose (`remember`, `mutableStateOf`)
- Functions → Composable functions (the building blocks of Compose UI)
- Conditionals/`when` → choosing what to render based on state (e.g. the Lemonade app's steps)
- Nullability → handling user input, which is always potentially empty
- Classes/inheritance → structuring non-UI logic (like the smart home example) that a real app's data layer would use
- Lambdas/trailing lambda syntax → the exact syntax Compose itself is built on (`Column { ... }`, `Button(onClick = { ... }) { ... }`)
- State hoisting → the pattern used throughout Compose's own APIs (`TextField`, `Switch`) and the foundation for scaling an app beyond a single composable

Learning Kotlin fundamentals before diving deeper into Compose made every subsequent module easier — by Module 9, reading and modifying someone else's Compose code (or my own from a few modules back) felt far more natural than it did at the start.

---

## Next Steps

- Continue into Unit 3: Display Lists and Use Material Design (Kotlin collections/generics, scrollable lists, Material theming and animation)
- Keep completing each pathway's quiz to collect the official Google Developer Profile badges
