import java.util.*

fun main() {
    val random: Random = Random()
    var nn = 0
    var ss = ""

    for (ii in 0..99)
    {
        nn = random.nextInt(4)

        ss = when (nn)
        {
            0 -> "north"
            1 -> "south"
            2 -> "west"
            3 -> "east"
            else -> "not found"
        }

        println("Number $nn: $ss")
    }
}