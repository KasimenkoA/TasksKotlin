package Tasks.Tasks250

import java.util.*

class Hero249(var power: Int, var defense: Int, var magic: Int)

fun main() {
    val arrayList = ArrayList<Hero249>()

    val random = Random()

    for (i in 0..9) {
        arrayList.add(Hero249(random.nextInt(100), random.nextInt(100), random.nextInt(100)))
    }

    for (hero in arrayList) {
        println(
            "Hero. Power: ${hero.power} . Defense: ${hero.defense} . Magic: ${hero.magic}."
        )
    }
}