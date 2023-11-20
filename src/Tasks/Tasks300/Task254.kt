package Tasks.Tasks300

import java.util.*

internal class Gamer254(val name: String) {
    val thing: String
        get() {
            val arrayList = ArrayList<String>()
            arrayList.add("stone")
            arrayList.add("scissors")
            arrayList.add("paper")
            val nn: Int
            val random = Random()
            nn = random.nextInt(3)
            return arrayList[nn]
        }
}

fun getWinNumber(tt1: String, tt2: String): Int {
    if (tt1 == "stone") {
        if (tt2 == "scissors") return 1
        if (tt2 == "paper") return 2
    } else if (tt1 == "scissors") {
        if (tt2 == "stone") return 2
        if (tt2 == "paper") return 1
    } else  // "paper"
    {
        if (tt2 == "stone") return 1
        if (tt2 == "scissors") return 2
    }
    return 0 // tt1.equals( tt2 )
}

fun main() {
    val gamer1 = Gamer254("Tom")
    val gamer2 = Gamer254("Bob")

    val tt1: String = gamer1.thing
    val tt2: String = gamer2.thing

    println("${gamer1.name}  - $tt1")
    println("${gamer2.name}  - $tt2")

    val winNumber: Int = getWinNumber(tt1, tt2)

    if (winNumber == 1) {
        println("Gamer ${gamer1.name} won!")
    } else if (winNumber == 2) {
        println("Gamer ${gamer2.name} won!")
    } else {
        println("Draw!")
    }
}