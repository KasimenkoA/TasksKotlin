package Tasks.Tasks300

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Input distance, km: ")
    val dd = scanner.nextDouble()

    val vv = dd / 1.07
    println("In versts: $vv")

    val mm = dd / 1.6
    println("In miles: $mm")

    val yy = dd / 0.00091
    println("In yards: $yy")
}