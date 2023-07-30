import java.util.*
import kotlin.math.pow

fun main() {
    val scanner = Scanner(System.`in`)
    print("Input number: ")
    val nn = scanner.nextInt()

    var pp: Int
    var sum = 0

    for (i in 1..10) {
        pp = nn.toDouble().pow(i.toDouble()).toInt()
        sum += pp
        println(pp)
    }

    println("Sum: $sum")
}