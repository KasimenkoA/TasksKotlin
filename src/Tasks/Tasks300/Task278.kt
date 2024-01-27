package Tasks.Tasks300

fun main() {
    val cards = doubleArrayOf(6.0, 7.0, 8.0, 9.0, 10.0, 2.0, 3.0, 4.0, 11.0)

    val pp = 4.0 / 36.0
    var m = 0.0
    var mm = 0.0

    for (card in cards) {
        m = card * pp
        println(m)
        mm += m
    }

    println("mm = $mm")
    val mmm = mm * 3
    println("Mathematical expectation: $mmm")
}