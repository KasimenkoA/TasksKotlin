package Tasks.Tasks250

import java.util.*

internal class Mouse {
    var age = 0
}

fun main() {
    val mouses = ArrayList<Mouse>()

    val random = Random()

    val mouse1 = Mouse()
    mouse1.age = 10

    val mouse2 = Mouse()
    mouse2.age = 20

    val mouse3 = Mouse()
    mouse3.age = 30

    mouses.add(mouse1)
    mouses.add(mouse2)
    mouses.add(mouse3)

    var sum = 0

    for (mouse in mouses) {
        sum += mouse.age
    }

    println(sum)
}