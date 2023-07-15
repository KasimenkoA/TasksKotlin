import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter your name: ")
    val name = scanner.nextLine()

    val ch = name[0]
    if (ch == 'A' || ch == 'B') {
        println("Your name is at the top of the list")
    } else {
        println("Your name is not at the top of the list")
    }
}