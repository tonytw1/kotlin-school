val a = 2

fun meh() = if (a > 1) {
    "ok"
} else {
    "meh"
}


fun main(args: Array<String>) {
    var mutable = a
    mutable = mutable + 1
    mutable += 1

    val teamplate = "Hello $a"

    println("Hello: " + meh() + mutable)
}
