package Tasks.Tasks300

import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)
    print("Input cost of the card: ")
    val nn = scanner.nextInt()

    val card: String
    card = when (nn) {
        6 -> "Six"
        7 -> "Seven"
        8 -> "Eight"
        9 -> "Nine"
        10 -> "Ten"
        2 -> "Jack"
        3 -> "Queen"
        4 -> "King"
        11 -> "Ace"
        else -> "Undefined"
    }

    println(card)

}