package Tasks.Tasks200

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Input number 1: ")
    val nn1 = scanner.nextInt()

    print("Input number 2: ")
    val nn2 = scanner.nextInt()

    print("Input number 3: ")
    val nn3 = scanner.nextInt()

    var mm = Int.MIN_VALUE

    mm = Math.max(mm, nn1)
    mm = Math.max(mm, nn2)
    mm = Math.max(mm, nn3)

    println("Maximum number is : $mm")
}