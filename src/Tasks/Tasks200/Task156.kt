fun main() {
    val mas = IntArray(10)
    for (i in mas.indices) {
        mas[i] = i + 1
    }

    for (ii in mas) {
        println(ii)
    }
}