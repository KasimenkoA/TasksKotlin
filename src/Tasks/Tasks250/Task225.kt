package Tasks.Tasks250

import java.util.*

fun main() {
    val sortedSet: SortedSet<String> = TreeSet()

    val scanner = Scanner(System.`in`)
    var ss: String

    for (i in 0..4) {
        print("Input your name: ")
        ss = scanner.nextLine()
        sortedSet.add(ss)
    }

    for (s in sortedSet) {
        println(s)
    }
}