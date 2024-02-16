package Tasks.Tasks300

import java.util.*

internal class Pearl(val color: String, val weight: Double)

fun main() {

    val list = ArrayList<Pearl>()

    var cc: Int
    var cc_str: String
    val random_color = Random()

    var ww: Double
    val random_weight = Random()

    for (i in 0..99) {
        cc_str = "black"
        cc = random_color.nextInt(2)
        if (cc == 1) cc_str = "white"
        ww = random_weight.nextDouble(200.0)
        println("Color: $cc_str, Weight: $ww")
        list.add(Pearl(cc_str, ww))
    }

}