package Tasks.Tasks250

import java.util.*

fun main() {
    val res: Int

    val scanner = Scanner(System.`in`)
    print("Input number: ")
    val nn = scanner.nextInt()

    try {
        res = 10 / nn
        println(res)
    } catch (e: Exception) {
        println("Error $e")
    }
}