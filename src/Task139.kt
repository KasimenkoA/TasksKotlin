fun main() {
    val myRectangle1 = MyRectangle()
    myRectangle1.setWidth(12.4)
    myRectangle1.setHeight(20.0)
    println(myRectangle1.area)

    val myRectangle2 = MyRectangle()
    myRectangle1.setWidth(1.13)
    myRectangle1.setHeight(80.9)
    println(myRectangle1.area)

    val myRectangle3 = MyRectangle()
    myRectangle1.setWidth(15.0)
    myRectangle1.setHeight(10.0)
    println(myRectangle1.area)
}

internal class MyRectangle {
    private var width = 0.0
    private var height = 0.0
    fun setWidth(width: Double) {
        this.width = width
    }

    fun setHeight(height: Double) {
        this.height = height
    }

    val area: Double
        get() = width * height
}