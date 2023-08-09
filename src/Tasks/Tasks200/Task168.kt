package Tasks.Tasks200

import java.util.*

fun main() {
    var nn: Int
    val random = Random()

    val scanner = Scanner(System.`in`)
    var ss: String

    while (true) {
        nn = random.nextInt(100)
        println(nn)
        println("Continue?")
        ss = scanner.nextLine().lowercase(Locale.getDefault())
        if (ss == "no") {
            break
        }
    }
}