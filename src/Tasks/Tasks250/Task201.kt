package Tasks.Tasks250

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Input string: ")
    val ss = scanner.nextLine()

    val ch = ss[0]
    if (ch == 'L') {
        println(ss.lowercase(Locale.getDefault()))
    }
    if (ch == 'u') {
        println(ss.uppercase(Locale.getDefault()))
    }
}