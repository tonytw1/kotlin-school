fun meh(a: Int) = if (a > 1) {
    "ok"
} else {
    "meh"
}

fun main(args: Array<String>) {
    val things = listOf("a", "b", "c")
    val a = things.size
    println("Hello: " + meh(a))
}
