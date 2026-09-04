fun main() {
    // var = mutable (can change)
    var cartTotal = 0
    cartTotal = cartTotal + 10
    println("Cart total: $cartTotal")   // Cart total: 10

    // Shorthand operators
    cartTotal += 20
    println("Cart total: $cartTotal")   // Cart total: 30

    cartTotal++
    println("Cart total: $cartTotal")   // Cart total: 31

    cartTotal--
    println("Cart total: $cartTotal")   // Cart total: 30

    // String template with expressions
    val unitsLeft = 5
    println("There are $unitsLeft items left in stock.")
    println("There are ${unitsLeft * 2} items in two stores.")
}
