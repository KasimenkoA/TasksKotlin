package Tasks.Tasks250

import java.util.*

fun main() {
    val arrayList = ArrayList<Int?>()

    var nn: Int
    val random = Random()

    for (i in 0..9) {
        nn = random.nextInt(10)
        arrayList.add(nn)
    }

    arrayList.sortBy { it }
    for (integer in arrayList) {
        println(integer)
    }
    println()

    arrayList.reverse()
    for (integer in arrayList) {
        println(integer)
    }
}
