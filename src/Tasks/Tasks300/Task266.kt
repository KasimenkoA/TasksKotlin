package Tasks.Tasks300

fun main() {
    var ss = 0

    for (i in 1..100) {
        if (i % 3 == 0) {
            println(i)
            ss += i
        }
    }

    println("Sum = $ss")
}