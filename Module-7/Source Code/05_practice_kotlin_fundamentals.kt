// Challenge 1: Mobile Notifications (conditionals)
fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages < 100) {
        println("You have $numberOfMessages notifications.")
    } else {
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}

// Challenge 2: Movie-Ticket Price (when as an expression)
fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when (age) {
        in 0..12 -> 15
        in 13..60 -> if (isMonday) 25 else 30
        in 61..100 -> 20
        else -> -1
    }
}

// Challenge 3: Temperature Converter (lambdas / function types)
fun printFinalTemperature(
    startingTemperature: Double,
    startingUnit: String,
    endingUnit: String,
    conversionFormula: (Double) -> Double
) {
    val convertedTemperature = conversionFormula(startingTemperature)
    println("$startingTemperature degrees $startingUnit is $convertedTemperature degrees $endingUnit.")
}

// Challenge 4: Song Catalog (classes, custom getter)
class Song(val title: String, val artist: String, val yearPublished: Int, val playCount: Int) {
    val isPopular: Boolean
        get() = playCount >= 1000

    fun printDescription() {
        println("$title, performed by $artist, was released in $yearPublished.")
    }
}

// Challenge 5: Internet Profile (nullability)
class Person(val name: String, val age: Int, val hobby: String? = null, val referrer: Person? = null) {
    fun showProfile() {
        println("Name: $name")
        println("Age: $age")
        if (hobby != null) {
            print("Likes to $hobby. ")
        }
        if (referrer != null) {
            print("Has a referrer named ${referrer.name}")
            if (referrer.hobby != null) {
                print(", who likes to ${referrer.hobby}.")
            }
        } else {
            print("Doesn't have a referrer.")
        }
        print("\n\n")
    }
}

// Challenge 6: Foldable Phones (inheritance, overriding)
open class Phone(var isScreenLightOn: Boolean = false) {
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }
}

class FoldablePhone(var isFolded: Boolean = true) : Phone() {
    override fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
        }
    }

    fun fold() {
        isFolded = true
    }

    fun unfold() {
        isFolded = false
    }
}

// Challenge 7: Special Auction (Elvis + safe call operators)
class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
    return bid?.amount ?: minimumPrice
}

fun main() {
    println("--- Challenge 1: Mobile Notifications ---")
    printNotificationSummary(51)
    printNotificationSummary(135)

    println("\n--- Challenge 2: Movie-Ticket Price ---")
    println(ticketPrice(5, false))
    println(ticketPrice(30, true))
    println(ticketPrice(70, false))
    println(ticketPrice(150, false))

    println("\n--- Challenge 3: Temperature Converter ---")
    printFinalTemperature(27.0, "Celsius", "Fahrenheit") { 9.0 / 5.0 * it + 32 }
    printFinalTemperature(350.0, "Kelvin", "Celsius") { it - 273.15 }
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin") { 5.0 / 9.0 * (it - 32) + 273.15 }

    println("\n--- Challenge 4: Song Catalog ---")
    val song = Song("Photograph", "Ed Sheeran", 2014, 1200)
    song.printDescription()
    println("Is popular: ${song.isPopular}")

    println("\n--- Challenge 5: Internet Profile ---")
    val referrer = Person("Alice", 28, "hiking")
    val person = Person("Bob", 32, "chess", referrer)
    person.showProfile()

    println("--- Challenge 6: Foldable Phones ---")
    val foldable = FoldablePhone()
    foldable.switchOn()
    println("Screen on while folded: ${foldable.isScreenLightOn}")
    foldable.unfold()
    foldable.switchOn()
    println("Screen on while unfolded: ${foldable.isScreenLightOn}")

    println("\n--- Challenge 7: Special Auction ---")
    println(auctionPrice(Bid(200, "Abdulaziz"), 100))
    println(auctionPrice(null, 100))
}
