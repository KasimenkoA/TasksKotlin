package Tasks.Tasks300

import java.util.*

fun main() {

    val cards = doubleArrayOf(
        6.0,
        7.0,
        8.0,
        9.0,
        10.0,
        2.0,
        3.0,
        4.0,
        11.0,
        6.0,
        7.0,
        8.0,
        9.0,
        10.0,
        2.0,
        3.0,
        4.0,
        11.0,
        6.0,
        7.0,
        8.0,
        9.0,
        10.0,
        2.0,
        3.0,
        4.0,
        11.0,
        6.0,
        7.0,
        8.0,
        9.0,
        10.0,
        2.0,
        3.0,
        4.0,
        11.0
    )
    val mm = 7.0

    var nn: Int
    val random = Random()

    var ss: Double
    var sum_ss = 0.0
    val mat_exp: Double

    for (i in 0..999) {
        ss = 0.0
        while (true) {
            nn = random.nextInt(36)
            ss += cards[nn]
            if (ss > 21) {
                ss = 0.0
                continue
            }
            if (ss + mm > 21) break
        }
        println(ss)
        sum_ss += ss
    }

    mat_exp = sum_ss / 1000
    println("Mathematical expectation: $mat_exp") // 17.5
}