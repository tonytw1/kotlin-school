fun meh(a: Int) = if (a > 1) {
    "ok"
} else {
    "meh"
}

fun main(args: Array<String>) {
    val things = listOf("c", "b", "a")
    val a = things.size

    things.map { t ->
        println(t)
    }

    for(thing in things) {
        println("Looping: " + thing)
    }

    println(things[0])

    val oneToFive = 1..5
    for(i in oneToFive) {
        println(i)
    }

    val sortedAndMapped = things.sortedBy { it }.map { it.toUpperCase() }
    println(sortedAndMapped)

    println("Hello: " + meh(a))
}
