fun meh(a: Int) = if (a > 1) {
    "ok"
} else {
    "meh"
}

class Widget(val name: String, val length: Int) {
    fun meh() = name.toUpperCase() + length
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

    val myWidget = Widget(length = 2, name = "My widget")
    println(myWidget.name)
    println(myWidget.meh())

    println("Hello: " + meh(a))
}
