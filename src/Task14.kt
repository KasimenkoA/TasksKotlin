fun main() {
    val msize = 50
    var mas_a = arrayOfNulls<Int>(msize)
    var mas_b = arrayOfNulls<Int>(msize)

    for (i in 0 until msize) mas_a[i] = (Math.random()*100).toInt()

    for (i in 0 until msize)
    {
        mas_b[i] = (mas_a[i]?:0) * 3

        println("${mas_a[i]} * 3 = ${mas_b[i]}")
    }
}