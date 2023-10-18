package Tasks.Tasks250

import java.util.ArrayList

fun main() {
    val arrayList = ArrayList<String>()

    arrayList.add("A")
    arrayList.add("B")
    arrayList.add("C")
    arrayList.add("D")
    arrayList.add("F")
    arrayList.add("G")

    arrayList.remove("B")
    arrayList.remove("D")

    for (character in arrayList) {
        println(character)
    }
}