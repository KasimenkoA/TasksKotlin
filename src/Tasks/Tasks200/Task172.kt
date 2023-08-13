package Tasks.Tasks200

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var ss: String

    for (i in 0..4) {
        print("Enter the name of the beast: ")
        ss = scanner.nextLine()
        if (ss.startsWith("v")) continue
        println("Beast $ss.")
    }
}