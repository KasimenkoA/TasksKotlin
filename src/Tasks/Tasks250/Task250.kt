package Tasks.Tasks250

import java.util.*

internal class Infantry(val attack: Int)

fun main() {
    val squad1 = ArrayList<Infantry>()
    val squad2 = ArrayList<Infantry>()

    var nn: Int
    val random = Random()

    for (i in 0..9) {
        squad1.add(Infantry(random.nextInt(100)))
        squad2.add(Infantry(random.nextInt(100)))
    }

    var attackSum1 = 0
    for (infantry in squad1) {
        println(infantry.attack)
        attackSum1 += infantry.attack
    }
    println("Attack sum = $attackSum1")
    println()

    var attackSum2 = 0
    for (infantry in squad2) {
        println(infantry.attack)
        attackSum2 += infantry.attack
    }
    println("Attack sum = $attackSum2")
    println()

    if (attackSum1 > attackSum2) {
        println("The first infantry squad is stronger.")
    } else {
        println("The second infantry squad is stronger.")
    }
}