package Tasks.Tasks200

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter the time of year number: ")
    val nn = scanner.nextInt()

    when (nn) {
        1 -> println("Winter")
        2 -> println("Spring")
        3 -> println("Summer")
        4 -> println("Autumn")
        else -> println("Undefined")
    }
}