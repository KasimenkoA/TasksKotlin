package Tasks.Tasks200

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter one character: ")
    val ch = scanner.nextLine()[0]

    val ss = if (Character.isDigit(ch)) "The symbol is a digit" else "The symbol is not a digit"
    println(ss)
}