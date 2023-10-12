package Tasks.Tasks250

import java.util.HashMap

fun main() {
    val map: MutableMap<Int, String> = HashMap()

    map[1] = "Red"
    map[2] = "Orange"
    map[3] = "Yellow"
    map[4] = "Green"
    map[5] = "Blue"
    map[6] = "Indigo"
    map[7] = "Violet"

    println(map[4])
}