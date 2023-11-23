package Tasks.Tasks300

import java.util.*

internal class Gamer256(val name: String) {
    var totalScore = 0
        private set

    fun addPoint() {
        totalScore = totalScore + 1
    }

    val randomNumber: Int
        get() {
            val random = Random()
            return random.nextInt(10)
        }
}

fun main() {
    val gamer1 = Gamer256("Zachar")
    val gamer2 = Gamer256("Vlad")

    var nn1: Int
    var nn2: Int
    for (i in 0..9) {
        nn1 = gamer1.randomNumber
        println("" + gamer1.name + " " + nn1)
        nn2 = gamer2.randomNumber
        println("" + gamer2.name + " " + nn2)
        if (nn1 > nn2) {
            gamer1.addPoint()
            println("The gamer " + gamer1.name + " got a point.")
        } else if (nn1 < nn2) {
            gamer2.addPoint()
            println("The gamer " + gamer2.name + " got a point.")
        } else {
            println("Draw.")
        }
        println()
    }

    println("Gamer " + gamer1.name + " - " + gamer1.totalScore)
    println("Gamer " + gamer2.name + " - " + gamer2.totalScore)

    if (gamer1.totalScore > gamer2.totalScore) {
        println("Gamer " + gamer1.name + " won!")
    } else if (gamer1.totalScore < gamer2.totalScore) {
        println("Gamer " + gamer2.name + " won!")
    } else {
        println("Draw!")
    }
}