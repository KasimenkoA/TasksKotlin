fun main() {
    val mas = arrayOfNulls<Rectangle>(3)

    mas[0] = Rectangle(10, 30)
    mas[1] = Rectangle(31, 14)
    mas[2] = Rectangle(43, 17)

    for (i in mas.indices) {
        mas[i]?.showInfo()
    }
}

internal class Rectangle(var length: Int, var width: Int) {
    private val square: Int
        private get() = length * width


    fun showInfo() {
        println("Square: $square")
    }

}