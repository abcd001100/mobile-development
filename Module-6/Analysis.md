# Module 6: Build a Basic Layout

## Codelabs Completed

| #   | Title                                    | Type    | URL                                                                                                                           |
| --- | ---------------------------------------- | ------- | ----------------------------------------------------------------------------------------------------------------------------- |
| 1   | Intro to Jetpack Compose                 | Video   | —                                                                                                                             |
| 2   | Design a birthday card app               | Video   | —                                                                                                                             |
| 3   | Build a simple app with text composables | Codelab | https://developer.android.com/codelabs/basic-android-kotlin-compose-text-composables                                          |
| 4   | Add images to your Android app           | Codelab | https://developer.android.com/codelabs/basic-android-kotlin-compose-add-images                                                |
| 5   | Practice: Compose Basics                 | Codelab | https://developer.android.com/codelabs/basic-android-kotlin-compose-composables-practice-problems                             |
| 6   | Project: Create a business card app      | Codelab | https://developer.android.com/codelabs/basic-android-kotlin-compose-business-card                                             |
| 7   | What's next?                             | Video   | —                                                                                                                             |
| 8   | Quiz                                     | Quiz    | https://developer.android.com/courses/quizzes/android-basics-compose-unit-1-pathway-3/android-basics-compose-unit-1-pathway-3 |

---

## What I Learned

### Key Concepts

- **`Text`** is the basic composable for displaying strings, with styling parameters such as `fontSize`, `lineHeight`, and `textAlign`.
- **`Column`** and **`Row`** are layout composables that arrange their children vertically and horizontally, respectively.
- **`Image`** displays a `Painter` (e.g. loaded with `painterResource`); `contentScale` controls how the image is scaled/cropped, and `alpha` controls opacity.
- **`Box`** stacks composables on top of one another — used to layer text over a background image.
- The **`Modifier`** system (`padding`, `fillMaxSize`, `align`, `weight`, `background`) is how size, spacing, and position are declared for any composable.
- The **`weight`** modifier inside a `Row`/`Column` divides available space proportionally between children — used to build the 2×2 quadrant grid.
- A `Surface` can accept a `border` and elevation/shadow to visually separate content, as used in later layout work.

### Composables Practiced

| File                 | Composable focus                                          |
| -------------------- | --------------------------------------------------------- |
| `BirthdayCardApp`    | `Text`, `Column`, `Image`, `Box`, `Modifier.align`        |
| `ComposeQuadrantApp` | `Row`, `Column`, `Modifier.weight`, `Modifier.background` |
| `BusinessCardApp`    | `Column`, `Row`, `Image`, `Spacer`, custom color palette  |

---

## Source Files

| Project               | Description                                                                                                                                                |
| --------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `BirthdayCardApp/`    | "Happy Birthday" app — two styled `Text` composables over a decorative background `Image` (combines the Text-composables and Add-images codelabs)          |
| `ComposeQuadrantApp/` | Practice: Compose Basics — a 2×2 grid, each quadrant describing a core Compose composable (`Text`, `Image`, `Row`, `Column`) with its own background color |
| `BusinessCardApp/`    | Final project — a business card screen with a logo, name, title, and three contact rows (phone, social, email)                                             |

---

## Challenges Completed

✅ Built a simple app with styled `Text` composables
✅ Added a background `Image` behind the greeting text
✅ Completed the Compose Basics practice problems (Quadrant app)
✅ Built and styled the Business Card project end-to-end

---

## Reflection

This pathway is where Compose actually starts to feel like UI programming: composing `Text`, `Image`, `Row`, and `Column` with modifiers to control layout. The Business Card project pulled everything together — a fixed layout with a logo, name/title block, and a repeated `ContactRow` composable, which was a good first example of extracting a reusable composable to avoid duplicating the same Row three times.
