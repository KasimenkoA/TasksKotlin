package Tasks.Tasks200

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("What city do you live in? ")
    val ss = scanner.nextLine()

    var ch: Char

    for (i in 0 until ss.length) {
        ch = ss[i]
        if (Character.isUpperCase(ch)) {
            println("You live in the city of " + ss.substring(i) + ".")
            break
        }
    }
}