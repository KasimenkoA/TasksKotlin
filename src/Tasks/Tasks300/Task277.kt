package Tasks.Tasks300

fun main() {
    val coins = doubleArrayOf(1.0, 2.0, 5.0, 10.0, 50.0)

    var mm = 0.0
    for (i in coins.indices) {
        mm += coins[i] * 0.5
    }

    println(mm)
}