package Tasks.Tasks300

import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)
    print("Input number: ")
    val nn = scanner.nextInt()

    val ss: String
    ss = when (nn) {
        1 -> "diadem"
        2 -> "mirror"
        else -> "flower"
    }

    println(ss)

}