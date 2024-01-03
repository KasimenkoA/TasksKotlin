package Tasks.Tasks300

import java.util.*

fun main() {

    var nn: Int
    val random = Random()

    var ss = 0.0
    val mm: Double
    val count = 100

    for (i in 0 until count) {
        nn = random.nextInt(6)
        nn = nn + 1
        ss += nn.toDouble()
        println(nn)
    }

    println()
    mm = ss / count
    println(mm)

}