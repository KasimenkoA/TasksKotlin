package Tasks.Tasks200

import java.util.*

fun main() {
    var rr: Double
    var nn: Int
    val random = Random()

    for (i in 0..9) {
        nn = random.nextInt(10000)
        println(nn)
        rr = nn / 1000.0
        println(rr)
        rr = Math.round(rr * 100.0) / 100.0
        println(rr)
        println()
    }
}