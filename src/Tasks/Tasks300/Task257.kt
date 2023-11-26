package Tasks.Tasks300

import java.util.*

internal class Train257 (var speed: Int = 0) {
    fun addSpeed(sp: Int) {
        speed += sp
    }
}

fun main() {

    val train1 = Train257()
    val train2 = Train257()

    val random = Random()
    var nn: Int

    while (true) {
        nn = random.nextInt(10)
        train1.addSpeed(nn)
        println(nn)
        nn = random.nextInt(10)
        train2.addSpeed(nn)
        println(nn)
        println()
        if (train1.speed >= 200 || train2.speed >= 200) break
    }

    println("Train 1: " + train1.speed)
    println("Train 2: " + train2.speed)

    if (train1.speed > train2.speed) {
        println("The first train won!")
    } else if (train1.speed < train2.speed) {
        println("The second train won!")
    } else {
        println("Draw!")
    }

}