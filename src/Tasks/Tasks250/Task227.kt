package Tasks.Tasks250

import java.util.*

fun main() {
    val map: MutableMap<String, Int> = HashMap()

    map["China"] = 1_410_000_000
    map["India"] = 1_380_000_000
    map["UnitedStates"] = 330_000_000
    map["Indonesia"] = 270_000_000
    map["Pakistan"] = 220_000_000

    println("India: " + map["India"])
}