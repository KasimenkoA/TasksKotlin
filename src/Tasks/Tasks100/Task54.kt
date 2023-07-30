fun main() {
    val msize = 100
    val list1 = arrayOfNulls<Int>(msize)
    val list2 = arrayOfNulls<Int>(msize)
    val list3 = arrayOfNulls<Int>(msize)
    var nn = 0

    for (i in 0 until msize) {
        nn = (Math.random() * 100).toInt()
        list1[i] = nn

        nn = (Math.random() * 100).toInt()
        list2[i] = nn
    }

    for (i in 0 until msize) {
        list3[i] = list1[i]!! + list2[i]!!;
        println("${"%3d".format(list3[i])} = ${"%3d".format(list1[i])} + ${"%3d".format(list2[i])}")
    }

}