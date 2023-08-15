package Tasks.Tasks200

fun main() {
    for (i in 1..100) {
        if (i % 3 == 0 || i % 7 == 0) continue
        println(i)
    }
}