package Tasks.Tasks200

import java.util.*

fun main() {
    var nn: Int
    val random = Random()

    var mm = Int.MAX_VALUE
    for (i in 0..9) {
        nn = random.nextInt(100)
        println(nn)
        mm = Math.min(mm, nn)
    }

    println()
    println(mm)
}