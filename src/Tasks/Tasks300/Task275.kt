package Tasks.Tasks300

import java.util.*

fun main() {
    val map: MutableMap<Double, Double> = HashMap()
    map[1000.0] = 0.01
    map[500.0] = 0.02
    map[200.0] = 0.05

    var mm = 0.0
    for ((key, value) in map) {
        mm += key * value
    }

    println("Mathematical expectation: $mm")
}