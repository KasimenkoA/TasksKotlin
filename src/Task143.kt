import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter the number of seconds: ")
    val nn = scanner.nextInt()

    val mm = nn / 60
    val ss = nn % 60
    println("Minutes: $mm, seconds: $ss")
}