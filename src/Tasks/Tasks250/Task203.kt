package Tasks.Tasks250

fun main() {
    val mas1 = IntArray(10)
    val mas2 = IntArray(10)

    for (i in 1..10) {
        mas1[i - 1] = i
        mas2[10 - i] = i
    }

    for (i in 0..9) {
        println(mas1[i])
    }
    println()

    for (i in 0..9) {
        println(mas2[i])
    }
}