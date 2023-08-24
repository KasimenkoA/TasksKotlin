package Tasks.Tasks200

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("How old are you?")
    val nn = scanner.nextInt()

    val ss = if (nn < 18) "It's too early for you to work." else "You can start working!"
    println(ss)
}