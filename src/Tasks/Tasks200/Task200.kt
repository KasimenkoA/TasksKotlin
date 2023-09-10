package Tasks.Tasks200

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Input string: ")
    val ss = scanner.nextLine()

    val mas_ch = ss.toCharArray()
    var nn = 0
    for (ch in mas_ch) {
        if (ch == 'o') nn++
    }

    println("$nn 'o' characters found.")
}