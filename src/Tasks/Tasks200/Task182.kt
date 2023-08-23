package Tasks.Tasks200

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("What is your height in centimeters? ")
    val nn = scanner.nextInt()

    val ss = if (nn > 175) "You are tall!" else "You are not tall."
    println(ss)
}