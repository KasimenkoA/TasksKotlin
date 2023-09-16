package Tasks.Tasks250

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var ss: String
    val date = Date()

    while (true) {
        print("Input string: ")
        ss = scanner.nextLine()
        if (ss == "date") {
            println(date)
        }
        if (ss == "exit") {
            break
        }
    }
}