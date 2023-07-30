fun main() {
    val mas = DoubleArray(40)
    var cur_dd = 0.0
    for (i in 0..39) {
        mas[i] = cur_dd
        cur_dd += 0.45
    }

    for (dd in mas) {
        println(Math.round(dd * 10.0) / 10.0)
    }
}