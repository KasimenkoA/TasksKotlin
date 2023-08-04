package Tasks.Tasks200

import java.util.*

fun main() {
    val arrayList = ArrayList<Int>()

    val scanner = Scanner(System.`in`)

    var ii: Int
    do {
        print("Input number: ")
        ii = scanner.nextInt()
        if (ii >= 0) arrayList.add(ii)
    } while (ii >= 0)

    var ss = 0
    for (integer in arrayList) {
        ss += integer
    }
    println("Sum: $ss")

}