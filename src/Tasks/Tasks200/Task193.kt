package Tasks.Tasks200

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter your last name and first name: ")
    val ss = scanner.nextLine()
    var ch: Char

    for (i in 0 until ss.length) {
        ch = ss[i]
        if (Character.isWhitespace(ch)) {
            println("Space position: $i")
        }
    }
}