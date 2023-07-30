import java.util.*

fun main() {
    val scanner: Scanner = Scanner(System.`in`)

    print("Input string: ")
    val ss = scanner.nextLine()

    val mas:CharArray = ss.toCharArray()
    val mas2:CharArray = CharArray(mas.size)

    for (i in 0 until mas.size)
    {
        if (mas[i].isDigit()) mas2[i] = mas[i]
    }

    val ss_new = mas2.concatToString()
    println(ss_new)
}