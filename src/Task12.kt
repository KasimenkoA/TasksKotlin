fun main() {
    var array = arrayOfNulls<Int>(3)

    array[0] = 2
    array[1] = 0
    array[2] = 1

    for(al in array)
    {
        when (al)
        {
            0 -> println("White")
            1 -> println("Blue")
            2 -> println("Red")
        }
    }

}