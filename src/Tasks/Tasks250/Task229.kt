package Tasks.Tasks250

import java.util.*

fun main() {
    val sortedMap: SortedMap<String, Int> = TreeMap()

    sortedMap["Liza"] = 140
    sortedMap["Alisa"] = 150
    sortedMap["Yakov"] = 145
    sortedMap["Vlad"] = 141
    sortedMap["Bob"] = 149

    for ((key, value) in sortedMap) {
        println("$key $value")
    }
}