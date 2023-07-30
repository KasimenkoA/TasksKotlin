import java.util.*

fun main() {
    val scanner: Scanner = Scanner(System.`in`)

    print("Inut your name: ")
    val name = scanner.nextLine()

    println("Hello, ${name.uppercase()}!")
}