fun main() {
    // Type inference - Kotlin infers the type automatically
    val count = 2            // Inferred as Int
    val language = "Kotlin"  // Inferred as String
    val active = true        // Inferred as Boolean

    // Explicit types
    val year: Int = 2024
    val pi: Double = 3.14159
    val grade: Char = 'A'
    val bigNumber: Long = 8_000_000_000L

    // String templates
    println("Count: $count")
    println("Language: $language (active: $active)")
    println("Year: $year, Pi ≈ $pi, Grade: $grade")
    println("Big number: $bigNumber")

    // String length property
    val message = "Hello, Kotlin!"
    println("Message: $message")
    println("Length: ${message.length}")
    println("Uppercase: ${message.uppercase()}")
}
