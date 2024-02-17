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

    var ww_count = 0
    var bb_count = 0
    var ww_sum = 0.0
    var bb_sum = 0.0

    for (pearl in list) {
        if (pearl.color == "white") {
            ww_count++
            ww_sum += pearl.weight
        } else {
            bb_count++
            bb_sum += pearl.weight
        }
    }

    val ww_avg = Math.round(ww_sum / ww_count)
    val bb_avg = Math.round(bb_sum / ww_count)

    println("White sum: $ww_sum")
    println("Black sum: $bb_sum")
    println("White avg: $ww_avg")
    println("Black avg: $bb_avg")

}