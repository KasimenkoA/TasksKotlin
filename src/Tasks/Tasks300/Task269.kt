package Tasks.Tasks300

import java.util.*

fun main() {

    var nn1: Int
    var nn2: Int
    var nn: Int
    val random = Random()

    var ss = 0.0
    val mm: Double
    val count = 100

    for (i in 0 until count) {
        nn1 = random.nextInt(6) + 1
        nn2 = random.nextInt(6) + 1
        nn = nn1 + nn2
        ss += nn.toDouble()
        println(nn)
    }

    println()
    mm = ss / count
    println(mm)

}