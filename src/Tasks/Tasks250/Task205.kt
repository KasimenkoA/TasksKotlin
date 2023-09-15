package Tasks.Tasks250

fun main() {
    val mas = IntArray(10)

    for (i in mas.indices) {
        mas[i] = (Math.random() * 100).toInt()
        if (i % 2 == 1) println("Index: $i, element: ${mas[i]}")
    }
}