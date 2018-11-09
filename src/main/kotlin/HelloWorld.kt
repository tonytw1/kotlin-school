fun meh(a: Int) = if (a > 1) {
    "ok"
} else {
    "meh"
}

fun main(args: Array<String>) {
    val things = listOf("a", "b", "c")
    val a = things.size

    things.map { t ->
        println(t)
    }

    for(thing in things) {
        println("Looping: " + thing)
    }

    println(things[0])

    println("Hello: " + meh(a))
}
