package Tasks.Tasks300

import java.util.*

fun main() {
    val n1 = 123
    val n2 = 50_365
    val n3 = 3_150_000
    val n4 = 100_005

    val arrayList = ArrayList<Int>()
    arrayList.add(n1)
    arrayList.add(n2)
    arrayList.add(n3)
    arrayList.add(n4)

    var max_n = Int.MIN_VALUE
    for (integer in arrayList) {
        if (integer > max_n) max_n = integer
    }

    println("Max: $max_n")
}