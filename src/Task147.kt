import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Input number: ")
    val nn = scanner.nextInt()

    var ii = 1
    var rr: Int
    while (ii <= 10) {
        rr = nn * ii
        System.out.printf("%5d\t * %5d\t = %5d\n", nn, ii, rr)
        ii++
    }
}