package Tasks.Tasks250

import java.util.*

fun main() {
    val arrayList = ArrayList<String>()
    arrayList.add("Tokyo")
    arrayList.add("Moscow")
    arrayList.add("Paris")
    arrayList.add("Beijing")
    arrayList.add("Brasilia")

    val iterator: Iterator<*> = arrayList.iterator()

    while (iterator.hasNext()) {
        println(iterator.next())
    }
}