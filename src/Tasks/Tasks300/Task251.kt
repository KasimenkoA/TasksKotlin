package Tasks.Tasks300

import java.util.*

internal class Flag251(val color1: String, val color2: String, val color3: String)

fun main() {
    val arrayList = ArrayList<String>()
    arrayList.add("White")
    arrayList.add("Black")
    arrayList.add("Red")
    arrayList.add("Green")
    arrayList.add("Blue")
    arrayList.add("Yellow")
    arrayList.add("Purple")
    arrayList.add("Pink")
    arrayList.add("Orange")
    arrayList.add("Gray")

    val random = Random()

    val flags = ArrayList<Flag251>()
    for (i in 0..9) {
        flags.add(Flag251(arrayList[random.nextInt(10)], arrayList[random.nextInt(10)], arrayList[random.nextInt(10)]))
    }

    for (flag in flags) {
        println("${flag.color1}, ${flag.color2}, ${flag.color3}")
        println()
    }
}