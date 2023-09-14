package Tasks.Tasks250

fun main() {
    val mas = IntArray(10)

    for (i in mas.indices) {
        mas[i] = (Math.random() * 100).toInt()
        println(mas[i])
    }

    var min = Int.MAX_VALUE
    for (ma in mas) {
        if (min > ma) min = ma
    }
    println("----")
    println("Min: $min")
}