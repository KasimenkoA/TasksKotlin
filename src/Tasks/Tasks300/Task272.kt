package Tasks.Tasks300

import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)

    print("Input number X: ")
    val X = scanner.nextDouble()

    print("Input number Y: ")
    val Y = scanner.nextDouble()

    val Z = Math.pow(X, Y) + X / Y
    println(Z)

}