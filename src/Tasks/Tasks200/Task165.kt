package Tasks.Tasks200

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Input number: ")
    val nn = scanner.nextInt()

    var mm = 2
    var mul: Int
    do {
        mul = nn * mm
        println("$nn * $mm = $mul")
        mm++
    } while (mm < 10)
}