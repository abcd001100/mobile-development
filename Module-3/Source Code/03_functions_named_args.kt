fun main() {

    println(birthdayGreeting(name = "Rex", age = 2))
    println()


    println(birthdayGreeting(name = "Lola"))
    println()


    println(birthdayGreeting("Max", 7))
}

fun birthdayGreeting(name: String, age: Int = 1): String {
    return "Happy Birthday, $name! You are now $age years old!"
}
