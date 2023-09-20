package Tasks.Tasks250

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Input your name: ")
    val ss1 = scanner.nextLine()

    print("Input your age: ")
    val ss2 = scanner.nextLine()

    showInfo(ss1,ss2)
}

fun showInfo(ss1: String?, ss2: String?) {
    println("Your name is $ss1, you are $ss2 years old.")
}
