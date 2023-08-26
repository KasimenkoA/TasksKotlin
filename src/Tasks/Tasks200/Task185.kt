package Tasks.Tasks200

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter you name: ")
    val ss = scanner.nextLine()

    val aa = if (ss.startsWith("A")) "You name starts with A." else "Your name doesn't start with the letter A."
    println(aa)
}
