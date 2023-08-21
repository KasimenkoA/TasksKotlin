package Tasks.Tasks200

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter your birth month: ")
    val ss = scanner.nextLine().lowercase(Locale.getDefault())

    when (ss) {
        "december", "january", "february" -> println("Winter")
        "march", "april", "may" -> println("Spring")
        "june", "july", "august" -> println("Summer")
        "september", "october", "november" -> println("Autumn")
        else -> println("Not defined")
    }
}