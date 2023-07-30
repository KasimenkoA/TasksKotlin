import java.util.*

fun main() {
    val scanner:Scanner = Scanner(System.`in`)

    print("Input number: ")
    val nn = scanner.nextInt()

    var ss = "Not found"

    if (nn == 1) ss = "Monday"
    if (nn == 2) ss = "Tuesday"
    if (nn == 3) ss = "Wednesday"

    println(ss)
}