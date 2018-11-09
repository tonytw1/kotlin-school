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

    println("Hello: " + meh(a))
}
