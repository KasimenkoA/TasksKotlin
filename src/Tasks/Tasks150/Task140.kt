package Tasks.Tasks150

fun main() {
    val math1 = MathOperations(20, 8)
    println(math1.add())
    println(math1.subtract())
    println("_____________________________________________")

    val math2 = MathOperations(16, 2)
    println(math2.add())
    println(math2.subtract())
}

internal class MathOperations(private val num1: Int, private val num2: Int) {
    fun add(): Int {
        return num1 + num2
    }

    fun subtract(): Int {
        return num1 - num2
    }
}