import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Input number: ")
    val nn = scanner.nextInt()

    var ff = 1
    for (i in 1..nn) {
        ff *= i
    }

    println("The factorial of the number $nn is $ff.")
}