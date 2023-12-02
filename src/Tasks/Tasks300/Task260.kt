package Tasks.Tasks300

import java.util.*

internal class Figure260(val name: String, val power: Int)

fun main() {

    val arrayList = ArrayList<Figure260>()

    arrayList.add(Figure260("pawn", 1))
    arrayList.add(Figure260("knight", 3))
    arrayList.add(Figure260("rook", 5))

    for (figure260 in arrayList) {
        println("Figure: ${figure260.name}, power: ${figure260.power}.")
    }

}