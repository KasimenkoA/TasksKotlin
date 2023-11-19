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

fun main() {
    val gamer1 = Gamer254("Tom")
    val gamer2 = Gamer254("Bob")

    println("${gamer1.name}  - ${gamer1.thing}")
    println("${gamer2.name}  - ${gamer2.thing}")
}