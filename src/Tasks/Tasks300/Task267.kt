package Tasks.Tasks300

fun main() {

    val nn = 6
    var ss = 0.0
    var mm = 0.0

    for (i in (1..nn))
    {
        println(i)
        ss += i.toDouble()
    }

    println()
    println("Sum: $ss")

    mm = ss / nn
    println()
    println("Mathematical expectation: $mm")

}