fun main() {
    var list = ArrayList<Int>()

    for (ii in 0..9) list.add((Math.random()*100).toInt())

    var max_nn = list[0]
    for (ii in 0 until list.size)
    {
        if (list[ii] > max_nn) max_nn = list[ii]
        println(list[ii])
    }

    println("Maximum: $max_nn")
}