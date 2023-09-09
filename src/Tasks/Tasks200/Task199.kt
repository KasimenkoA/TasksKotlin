package Tasks.Tasks200

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var ss: String
    var sb: String

    while (true) {
        print("Input string: ")
        ss = scanner.nextLine()
        if (ss.length < 5) continue
        sb = ss.substring(1, 5)
        println(sb)
        if (sb == "exit" || sb == "stop") break
    }
}