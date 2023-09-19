package Tasks.Tasks250

import java.util.*

fun main() {
    val random = Random()
    val aa = random.nextDouble(10.0)
    val bb = random.nextDouble(10.0)

    println(aa)
    println(bb)
    println()

    val cc: Double

    cc = if (aa > bb) {
        Math.pow(aa, bb)
    } else {
        Math.pow(bb, aa)
    }
    println(cc)
}