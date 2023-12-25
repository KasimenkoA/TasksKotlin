package Tasks.Tasks300

import java.util.*

internal class Plane264(name: Int, speed: Int) {
    val name: String
    val speed: Int

    init {
        this.name = "Plane$name"
        this.speed = speed
    }
}

fun main() {

    val arrayList = ArrayList<Plane264>()
    val random = Random()

    for (i in 1..10) {
        arrayList.add(Plane264(i, random.nextInt(8000)))
    }

    for (plane264 in arrayList) {
        println("" + plane264.name + ", speed: " + plane264.speed)
    }

}