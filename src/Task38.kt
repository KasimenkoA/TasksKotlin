import MyMethods.MyCollections

fun main() {
    val list = MyCollections().getMasRandomInteger(100,1000)

    var nn_max = list[0]
    var nn_min = list[0]
    var nn_sum = 0

    for (i in 0 until list.size)
    {
        if (list[i]>nn_max) nn_max = list[i]
        if (list[i]<nn_min) nn_min = list[i]

        nn_sum += list[i]
    }

    val nn_av = nn_sum/list.size

    println("Maximum: $nn_max")
    println("Minimum: $nn_min")
    println("Average: $nn_av")

}