package Tasks.Tasks250

import java.util.*

internal class Cube248 {
    var square = 0
}

fun main() {
    var nn: Int
    val random = Random()

    nn = random.nextInt(100)
    val cube1 = Cube248()
    cube1.square = nn
    println(cube1.square)

    nn = random.nextInt(100)
    val cube2 = Cube248()
    cube2.square = nn
    println(cube2.square)

    nn = random.nextInt(100)
    val cube3 = Cube248()
    cube3.square = nn
    println(cube3.square)

    println()

    val av: Int = (cube1.square + cube2.square + cube3.square) / 3
    println("Average: $av")
}