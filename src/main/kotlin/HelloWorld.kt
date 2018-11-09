fun meh() = "meh"

val a = 1

fun main(args: Array<String>) {
    var mutable = a
    mutable = mutable + 1

    println("Hello: " + meh() + mutable)
}