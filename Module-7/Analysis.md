# Module 7: Kotlin Fundamentals

## Pathway Reference
**Pathway:** https://developer.android.com/courses/pathways/android-basics-compose-unit-2-pathway-1
**Unit:** 2 — Building app UI
**Pathway:** 1 — Kotlin fundamentals

---

## Codelabs Completed

| # | Title | Type | URL |
|---|---|---|---|
| 1 | Kotlin Fundamentals | Video | — |
| 2 | Write conditionals in Kotlin | Codelab | https://developer.android.com/codelabs/basic-android-kotlin-compose-conditionals |
| 3 | Use nullability in Kotlin | Codelab | https://developer.android.com/codelabs/basic-android-kotlin-compose-nullability |
| 4 | Use classes and objects in Kotlin | Codelab | https://developer.android.com/codelabs/basic-android-kotlin-compose-classes-and-objects |
| 5 | Use function types and lambda expressions in Kotlin | Codelab | https://developer.android.com/codelabs/basic-android-kotlin-compose-function-types-and-lambda |
| 6 | Practice: Kotlin Fundamentals | Codelab | https://developer.android.com/codelabs/basic-android-kotlin-compose-kotlin-fundamentals-practice-problems |
| 7 | What's next? | Video | — |
| 8 | Quiz | Quiz | https://developer.android.com/courses/quizzes/android-basics-compose-unit-2-pathway-1/android-basics-compose-unit-2-pathway-1 |

---

## What I Learned

### Conditionals
- `if/else` and `when` can be used either as **statements** (perform an action) or as **expressions** (return a value assigned to a variable).
- `when` supports comma-separated matches (`2, 3, 5 ->`), range checks (`in 1..10 ->`), and type checks (`is Int ->`).

### Nullability
- A type suffixed with `?` (e.g. `String?`) is nullable; a plain type cannot hold `null`.
- The **safe call operator** `?.` returns `null` instead of throwing when the receiver is `null`.
- The **not-null assertion** `!!` throws a `NullPointerException` at runtime if the value is `null` — only safe when nullability has already been ruled out.
- The **Elvis operator** `?:` supplies a default value when the left-hand expression is `null`.

### Classes and Objects
- `open class` allows a class and its members to be subclassed/overridden; `override` implements a subclass-specific version of a member.
- Constructor parameters, `protected set`, and custom **property delegates** (`ReadWriteProperty`) were used to enforce a `RangeRegulator` that clamps a value between a min and max.
- **Composition** (a class holding references to other objects, like `SmartHome` holding a `SmartTvDevice`) models a "has-a" relationship, as opposed to inheritance's "is-a" relationship.

### Function Types and Lambdas
- A **function type** (`(Int) -> String`) describes a function's parameter and return types, letting functions be stored in variables, passed as arguments, and returned from other functions.
- **Lambda expressions** are anonymous functions; a single unnamed parameter can be referred to as `it`.
- **Trailing lambda syntax** moves a function-type argument outside the parentheses when it's the last parameter — the pattern used constantly in Compose (`Column { ... }`) and with `repeat(n) { ... }`.

---

## Source Files

| File | Concepts |
|---|---|
| `01_conditionals.kt` | `if/else`, `when` as statement and expression, range/type matching |
| `02_nullability.kt` | Nullable types, `?.`, `!!`, `?:`, if/else null checks |
| `03_classes_objects.kt` | Inheritance, `open`/`override`, property delegation, composition (smart home example) |
| `04_function_types_lambdas.kt` | Function types, lambdas, `it`, trailing lambda syntax, `repeat()` |
| `05_practice_kotlin_fundamentals.kt` | 7 practice challenges combining conditionals, nullability, classes, and lambdas |

---

## Challenges Completed
✅ Write conditionals with `if/else` and `when`
✅ Use nullable types and null-safety operators
✅ Define classes with inheritance, overriding, and property delegation
✅ Use function types and lambda expressions, including trailing lambda syntax
✅ Practice: Kotlin Fundamentals — Mobile Notifications, Movie-Ticket Price, Temperature Converter, Song Catalog, Internet Profile, Foldable Phones, Special Auction

---

## Reflection
This pathway is the "advanced Kotlin" counterpart to Unit 1's introduction — conditionals, nullability, classes, and lambdas are exactly the building blocks Jetpack Compose leans on (composables are themselves lambdas, and `remember { mutableStateOf(...) }` relies on trailing lambda syntax). Understanding null-safety in particular pays off immediately once forms/inputs are involved, since user input is naturally nullable/optional.
