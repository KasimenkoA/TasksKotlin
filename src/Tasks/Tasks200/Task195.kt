package Tasks.Tasks200

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter any line: ")
    val ss = scanner.nextLine()

    if (Character.isLowerCase(ss[0])) {
        println("Your word starts with a small letter.")
    } else {
        println("Your word starts with a capital letter.")
    }
}