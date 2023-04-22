fun main() {
    var sum = 0

    for (i in 0..29)
    {
        for (j in 0..19)
        {
            for (k in 0..9)
            {
                sum += i*j*k
            }
        }
    }

    println(sum)
}