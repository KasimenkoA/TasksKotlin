package Tasks.Tasks300

import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)

    var count = 0
    var sumTime = 0.0
    var curTime = 0.0
    while (true) {
        print("Input waiting time: ")
        curTime = scanner.nextDouble()
        if (curTime < 0.0) break
        sumTime += curTime
        count++
    }

    val average = sumTime / count
    println("Average: $average")

}