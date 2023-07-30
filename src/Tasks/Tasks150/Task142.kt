import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter the year: ")
    val nn = scanner.nextInt()

    if (nn % 4 == 0 && nn % 100 != 0 || nn % 400 == 0) {
        println("The year $nn is a leap year")
    } else {
        println("The year $nn is not a leap year")
    }
}