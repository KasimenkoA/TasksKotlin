import java.util.*

fun main() {
    val scanner:Scanner = Scanner(System.`in`)

    print("Input number: ")
    val nn = scanner.nextInt()

    val ss = when(nn)
    {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        else -> "Not found"
    }

    println(ss)
}