val a = 2

fun meh(): String {
    if (a > 1) {
        return "ok"
    } else {
        return "meh"
    }
}

fun main(args: Array<String>) {
    var mutable = a
    mutable = mutable + 1
    mutable += 1

    val teamplate = "Hello $a"

    println("Hello: " + meh() + mutable)
}
