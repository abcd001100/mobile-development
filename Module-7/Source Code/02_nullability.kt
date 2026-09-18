fun main() {
    // Nullable type — can hold a value or null
    var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor)

    // Safe call operator (?.) — returns null instead of crashing
    println(favoriteActor?.length)

    favoriteActor = null
    println(favoriteActor)
    println(favoriteActor?.length)

    // Not-null assertion operator (!!) — only safe when you are certain the value isn't null
    favoriteActor = "Sandra Oh"
    println(favoriteActor!!.length)

    // if/else null check — inside the if block, the compiler treats it as non-nullable
    if (favoriteActor != null) {
        println("The number of characters in your favorite actor's name is ${favoriteActor.length}.")
    } else {
        println("You didn't input a name.")
    }

    // if/else expression converting a nullable value into a non-nullable one
    val lengthOfName = if (favoriteActor != null) {
        favoriteActor.length
    } else {
        0
    }
    println("The number of characters in your favorite actor's name is $lengthOfName.")

    // Elvis operator (?:) — provides a default value when the left side is null
    favoriteActor = null
    val lengthWithElvis = favoriteActor?.length ?: 0
    println("The number of characters in your favorite actor's name is $lengthWithElvis.")
}
