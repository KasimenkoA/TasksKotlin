package Tasks.Tasks200

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var nn: Int

    var simple = true
    while (simple) {
        print("Input number: ")
        nn = scanner.nextInt()
        for (i in 2 until nn) {
            if (nn % i == 0) {
                simple = false
                println("The number is not simple!")
                break
            }
        }
    }
}