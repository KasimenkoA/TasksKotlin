package Tasks.Tasks250

import java.util.*
import kotlin.collections.HashSet

fun main() {
    val numset: MutableSet<Int> = java.util.HashSet()

    var nn: Int
    val random = Random()

    for (i in 0..9) {
        nn = random.nextInt(10)
        numset.add(nn)
    }

    for (integer in numset) {
        println(integer)
    }
    println("Size: " + numset.size)
}