package Tasks.Tasks300

import java.util.*

internal enum class Months262 {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
}

fun main() {
    val scanner = Scanner(System.`in`)
    print("Input number: ")
    val nn = scanner.nextInt()

    println(Months262.values()[nn - 1])

}