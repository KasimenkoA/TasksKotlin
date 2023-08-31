package Tasks.Tasks200

fun main() {
    var rr: Double
    var sr: Double

    for (i in 0..9) {
        rr = Math.random() * 100
        sr = Math.sqrt(rr)
        println("Square root from $rr is $sr")
    }
}