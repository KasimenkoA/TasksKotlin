package Tasks.Tasks250

import java.util.*

fun main() {
    val set: MutableSet<String> = HashSet()
    set.add("white")
    set.add("blue")
    set.add("red")

    val iterator: Iterator<*> = set.iterator()

    while (iterator.hasNext()) {
        println(iterator.next())
    }
}