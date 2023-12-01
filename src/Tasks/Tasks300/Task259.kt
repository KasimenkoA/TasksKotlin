package Tasks.Tasks300

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Input number: ")
    val nn = scanner.nextInt()

    val n1 = 5
    val n2 = 1

    val n1_num: Int
    val n2_num: Int

    n1_num = nn / n1
    n2_num = (nn - n1 * n1_num) / n2

    println("$n1 - count: $n1_num")
    println("$n2 - count: $n2_num")
}