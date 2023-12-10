package Tasks.Tasks300

internal interface Shape263 {
    val area: Double
}

internal class Rectangle263(private val width: Double, private val height: Double) : Shape263 {
    override val area: Double
        get() = width * height
}

internal class Triangle263(private val width: Double, private val height: Double) : Shape263 {
    override val area: Double
        get() = width * height / 2
}

internal class Circle263(private val radius: Double) : Shape263 {
    override val area: Double
        get() = Math.PI * radius * radius
}

fun main() {
    val rectangle263 = Rectangle263(10.0, 5.0)
    println(rectangle263.area)

    val triangle263 = Triangle263(10.0, 5.0)
    println(triangle263.area)

    val circle263 = Circle263(10.0)
    println(circle263.area)
}