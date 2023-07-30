fun main() {
    var sum = 1000
    var oper_count = 0
    var nn = 0

    while (sum>0)
    {
        nn = (Math.random()*10).toInt()
        sum -= nn
        oper_count++
        println(nn)
    }

    println()
    println("sum: $sum")
    println("count: $oper_count")
}