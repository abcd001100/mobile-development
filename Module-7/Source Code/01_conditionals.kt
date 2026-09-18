fun main() {
    val trafficLightColor = "Yellow"

    // if / else if / else as a statement
    if (trafficLightColor == "Red") {
        println("Stop")
    } else if (trafficLightColor == "Yellow") {
        println("Slow")
    } else if (trafficLightColor == "Green") {
        println("Go")
    } else {
        println("Invalid traffic-light color")
    }

    // when as a statement, with comma-separated and range matches
    val x = 4
    when (x) {
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
        else -> println("x isn't a prime number between 1 and 10.")
    }

    // when with the `is` keyword for type checking
    val y: Any = 20
    when (y) {
        2, 3, 5, 7 -> println("y is a prime number between 1 and 10.")
        in 1..10 -> println("y is a number between 1 and 10, but not a prime number.")
        is Int -> println("y is an integer number, but not between 1 and 10.")
        else -> println("y isn't an integer number.")
    }

    // if/else as an expression that returns a value
    val message =
        if (trafficLightColor == "Red") "Stop"
        else if (trafficLightColor == "Yellow") "Slow"
        else if (trafficLightColor == "Green") "Go"
        else "Invalid traffic-light color"
    println(message)

    // when as an expression that returns a value
    val whenMessage = when (trafficLightColor) {
        "Red" -> "Stop"
        "Yellow", "Amber" -> "Slow"
        "Green" -> "Go"
        else -> "Invalid traffic-light color"
    }
    println(whenMessage)
}
