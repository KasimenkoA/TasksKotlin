fun main() {
    var mm = 0

    for (i in 2..9)
    {
        for (j in 2..9)
        {
            mm = i*j
            println("$i * $j = ${String.format("%2d",mm)}")
        }
    }
}