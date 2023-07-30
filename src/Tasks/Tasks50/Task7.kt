fun main() {
    var nn_cur: Int
    var nn_sum = 0
    val nn_Average: Int

    for (ii in 1..10)
    {
        nn_cur = (Math.random()*100).toInt()
        println(nn_cur)
        nn_sum += nn_cur
    }

    nn_Average = nn_sum / 10
    println("Average: $nn_Average")
}