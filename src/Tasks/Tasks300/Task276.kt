package Tasks.Tasks300

import java.util.*

fun main() {

    val points = intArrayOf(10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0)
    val pp = DoubleArray(11)
    pp[0] = 0.01
    pp[1] = 0.03
    pp[2] = 0.05
    pp[3] = 0.07
    pp[4] = 0.12
    pp[5] = 0.26
    pp[6] = 0.23
    pp[7] = 0.07
    pp[8] = 0.07
    pp[9] = 0.05
    pp[10] = 0.04

    println(Arrays.stream(pp).sum())
    println()

    var mm = 0.0
    var mm_ = 0.0
    for (i in 0..9) {
        mm_ = points[i] * pp[i]
        println(mm_)
        mm += mm_
    }

    println()
    println("Mathematical expectation: $mm")

}