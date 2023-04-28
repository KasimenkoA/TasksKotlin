fun main() {
    val xx = (Math.random()*100).toInt()
    println(xx)

    val yy: Int = getX(xx)
    println(yy)
}

fun getX(xx: Int): Int {
    return (2*xx + 37)
}
