package Tasks.Tasks200

fun main() {
    for (i in 1..100) {
        if (i == 50) break
        if (i % 3 != 0) {
            println(i)
        }
    }
}