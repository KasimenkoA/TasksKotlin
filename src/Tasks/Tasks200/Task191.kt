package Tasks.Tasks200

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var ss: String
    var ch: Char
    var nn: Int

    while (true) {
        print("Input digit: ")
        ss = scanner.nextLine()
        ch = ss[0]
        if (Character.isLetter(ch)) {
            println("This is not a digit!")
            break
        }
        nn = Character.getNumericValue(ch)
        nn *= nn
        println(nn)
    }
}