package Tasks.Tasks300

fun main() {
    var nn = 0

    for (i in 1..100) {
        if (i % 3 == 0) {
            println(i)
            nn += i
        }
    }

    println(nn)
}