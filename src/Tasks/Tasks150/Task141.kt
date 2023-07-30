import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Input number: ")
    val nn = scanner.nextInt()

    if (nn % 2 == 1) {
        println("The number $nn is not even.")
    } else {
        println("The number $nn is even.")
    }
}