import java.util.*

fun main() {
    val scanner: Scanner = Scanner(System.`in`)
    print("Input number of month: ")
    val nn = scanner.nextInt()

    val ss:String = when(nn)
    {
        12,1,2 -> "winter"
        3,4,5 -> "spring"
        6,7,8 -> "summer"
        9,10,11 -> "autumn"
        else -> "not found"
    }

    println(ss)
}