package Tasks.Tasks200

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Input mark from 1 to 5: ")
    val nn = scanner.nextInt()

    when (nn) {
        1 -> println("Bad")
        2 -> println("Satisfactory")
        3 -> println("Well")
        4 -> println("Excellent")
        5 -> println("Super")
        else -> println("Undefined")
    }
}