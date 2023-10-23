package Tasks.Tasks250

import java.util.*

fun main() {
    val ss = ArrayList<String?>()
    ss.add("red")
    ss.add("orange")
    ss.add("yellow")
    ss.add("green")
    ss.add("blue")
    ss.add("indigo")
    ss.add("violet")

    Collections.shuffle(ss)
    for (s in ss) {
        println(s)
    }
}