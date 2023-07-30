import java.util.*

fun main() {
    val scanner:Scanner = Scanner(System.`in`)

    print("Input string: ")
    val ss = scanner.nextLine()

    val ar = ss.toCharArray()
    for (ch in ar) {
        println(ch)
    }
}