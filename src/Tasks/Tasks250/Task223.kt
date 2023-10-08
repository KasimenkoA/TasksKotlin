package Tasks.Tasks250

import java.util.ArrayList

fun main() {
    val colors: MutableList<String> = ArrayList()

    colors.add("Red")
    colors.add("Orange")
    colors.add("Yellow")
    colors.add("Green")
    colors.add("Blue")
    colors.add("Indigo")
    colors.add("Violet")

    for (i in colors.indices) {
        println("Color: ${colors[i]}")
    }
}