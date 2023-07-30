import java.util.*

fun main() {
    val scanner: Scanner = Scanner(System.`in`)

    print("Input number: ")
    val nn = scanner.nextInt()

    val nn_rest = nn % 2
    println(nn_rest)

    if (nn_rest == 0) println("Eval number")
    else println("Not eval number")

}