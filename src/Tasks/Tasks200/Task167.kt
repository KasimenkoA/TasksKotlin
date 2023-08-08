package Tasks.Tasks200

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    var ss: String
    while (true) {
        print("Input string: ")
        ss = scanner.nextLine()

        if (ss == "stop") {
            println("You have entered the word stop!")
            break
        }
    }
}