package Tasks.Tasks200

import java.util.*

fun main() {
    val array1 = ArrayList<Char>()
    val array2 = ArrayList<Char>()

    var ss: String
    var ch: Char

    val scanner = Scanner(System.`in`)

    for (i in 0..9) {
        print("Input Symbol: ")
        ss = scanner.nextLine()
        ch = ss[0]
        if (Character.isLetter(ch)) {
            array1.add(ch)
        } else if (Character.isDigit(ch)) {
            array2.add(ch)
        }
    }

    println("Letters:")
    for (character in array1) {
        println(character)
    }
    println()

    println("Digits:")
    for (character in array2) {
        println(character)
    }
}