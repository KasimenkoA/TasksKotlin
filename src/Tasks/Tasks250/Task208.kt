package Tasks.Tasks250

fun main() {
    val a = 5.2
    val b = 12.8
    val c = 2.7

    val d: Double = aver(a, b, c)
    println(d)
}

private fun aver(a: Double, b: Double, c: Double): Double {
    return (a + b + c) / 3
}