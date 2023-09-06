package Tasks.Tasks200

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter any character: ")
    val ss = scanner.nextLine()

    val ch = ss[0]
    if (ch == 'o' || ch == 'a' || ch == 'k') {
        println(Character.toUpperCase(ch))
    }
}