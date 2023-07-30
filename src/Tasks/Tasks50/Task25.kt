import java.util.*

fun main() {
    val scanner: Scanner = Scanner(System.`in`)
    var nn = 0

    while (true)
    {
        print("Input number: ")
        nn = scanner.nextInt()

        if (nn == 9)
        {
            println("Exit.")
            break
        }
        else
        {
            println("Next number: ${nn+1}")
        }
    }
}