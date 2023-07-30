import java.util.*

fun main() {
    val scanner: Scanner = Scanner(System.`in`)
    print("Input temperature: ")
    val nn = scanner.nextInt()

    val ss = when
    {
        nn<0 -> "ice"
        nn<=100 -> "water"
        else -> "steam"
    }

    println(ss)
}