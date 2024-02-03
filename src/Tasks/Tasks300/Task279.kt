package Tasks.Tasks300

import java.util.*

fun main() {

    val len = 8
    val mm = Array(len) { IntArray(len) }

    var nn: Int
    val random = Random()

    for (i in 0 until len) {
        for (j in 0 until len) {
            mm[i][j] = random.nextInt(7) + 1
        }
    }

    for (i in 0..7) {
        println(mm[i][i])
    }

}