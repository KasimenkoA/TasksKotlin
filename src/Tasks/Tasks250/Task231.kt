package Tasks.Tasks250

import java.util.*
import kotlin.collections.HashSet

fun main() {
    val set: MutableSet<Int> = HashSet()

    var nn: Int
    val random = Random()

    for (i in 0..9) {
        nn = random.nextInt(10)
        set.add(nn)
    }

    var even_nn = 0
    for (integer in set) {
        println(integer)
        if (integer % 2 == 0) even_nn++
    }

    println()
    println(even_nn)
}