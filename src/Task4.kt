fun main() {
    val n1 = (Math.random()*100).toInt()
    println(n1)

    val n2 = (Math.random()*100).toInt()
    println(n2)

    println()
    if(n1>n2) println("The number: $n1 is grater!")
    else println("The number: $n2 is grater!")
}