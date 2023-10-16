package Tasks.Tasks250

import java.util.*

fun main() {
    val map: MutableMap<String, String> = HashMap()

    map["Vova"] = "Moscow"
    map["Piter"] = "Tver"
    map["Sveta"] = "Kazan"
    map["Slava"] = "Novosibirsk"
    map["Ulia"] = "Khabarovsk"

    val set: Set<Map.Entry<String, String>> = map.entries

    for ((key, value) in set) {
        println("$key - $value")
    }
}