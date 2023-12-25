package Tasks.Tasks300

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Input distance: ")
    val ll = scanner.nextDouble()

    print("Input time: ")
    val tt = scanner.nextDouble()

    val speed = ll / tt
    println("Speed: $speed")
}