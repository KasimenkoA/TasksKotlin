import java.util.*

fun main() {
    val scanner:Scanner = Scanner(System.`in`)

    print("Input string: ")
    val ss = scanner.nextLine()

    val ar = ss.toCharArray()
    val ar2 = ss.toCharArray()
    for (i in 0 until ar.size) {
        ar2[ar.size-i-1] = ar[i]
    }

    //val ss2:String = String(ar2)
    val ss2:String = ar2.concatToString()

    println("$ss2")
}