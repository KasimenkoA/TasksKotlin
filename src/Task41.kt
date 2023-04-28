fun main() {
    var nn = 0
    var sum = 0

    while (sum<=1000)
    {
        nn = (Math.random()*10).toInt()
        sum += nn
        println(nn)
    }

    println()
    println("sum: $sum")
}