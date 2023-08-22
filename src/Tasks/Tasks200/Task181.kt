package Tasks.Tasks200

import java.util.*

fun main() {
    var nn: Int
    var even: Boolean
    val random = Random()

    for (i in 0..9) {
        nn = random.nextInt(100)
        even = if (nn % 2 == 0) true else false
        if (even) {
            println("Number: $nn is even.")
        } else {
            println("Number: $nn is not even.")
        }
    }

}