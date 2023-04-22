fun main() {
    var sum = 0

    for (i in 0..99)
    {
        if ((i in 0..20) || (i in 45..56) || (i in 80..99)) sum += i
    }

    println(sum)
}