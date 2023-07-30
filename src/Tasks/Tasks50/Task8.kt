import java.util.*

fun main() {
    var nn_cur: Int
    var nn_sum = 0
    val scanner: Scanner = Scanner(System.`in`)

    for (ii in 1..3)
    {
        print("Input $ii number: ")
        nn_cur = scanner.nextInt()
        nn_sum += nn_cur
    }

    println("Sum: $nn_sum")
}