package Tasks.Tasks250

import java.util.*

fun main() {
    val arrayList = ArrayList<Int>()

    var nn: Int
    val random = Random()

    for (i in 0..9) {
        nn = random.nextInt(10)
        arrayList.add(nn)
    }

    for (integer in arrayList) {
        println(integer)
    }

    println()
    println("Max: " + Collections.max(arrayList))
    println("Min: " + Collections.min(arrayList))
}