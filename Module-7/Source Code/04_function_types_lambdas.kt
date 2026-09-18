// Functions stored as values
val trick = {
    println("No treats!")
}

val treat = {
    println("Have a treat!")
}

// A function that takes an optional function-type parameter and returns a function
fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if (isTrick) {
        return trick
    } else {
        if (extraTreat != null) {
            println(extraTreat(5))
        }
        return treat
    }
}

fun main() {
    // Function reference operator (::)
    fun trickFn() = println("No treats! (from a top-level function)")
    val trickFunction = ::trickFn
    trickFunction()

    // Lambda stored in a variable and invoked
    val trickFunction2 = trick
    trick()
    trickFunction2()

    // Function type with a parameter, using trailing lambda syntax
    val coins: (Int) -> String = { quantity -> "$quantity quarters" }
    println(coins(5))

    // Lambda shorthand: single parameter referred to as `it`
    val coinsShort: (Int) -> String = { "$it quarters" }
    println(coinsShort(3))

    // Passing a lambda as an argument, and returning a function
    val treatFunction = trickOrTreat(false) { "$it quarters" }
    val trickFunction3 = trickOrTreat(true, null)

    // Higher-order function: repeat() takes a function as its second parameter
    repeat(4) {
        treatFunction()
    }
    trickFunction3()
}
