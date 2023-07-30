fun main() {
    var list:MutableList<Int> = mutableListOf<Int>()

    val period_mas = 0 until 100

    for (ii in period_mas)
    {
        list.add((Math.random()*100).toInt())
    }

    var sum = 0
    for (i in list) {
        println(i)
        sum += i
    }
    println("Amount: $sum")
}