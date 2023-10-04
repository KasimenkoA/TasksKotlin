package Tasks.Tasks250

internal open class Fruit {
    open fun showInfo() {
        println("I am a fruit.")
    }
}

internal class Apple : Fruit() {
    override fun showInfo() {
        super.showInfo()
        println("I am an apple.")
    }
}

internal class Pear : Fruit() {
    override fun showInfo() {
        super.showInfo()
        println("I am a pear.")
    }
}

fun main() {
    val fruit = Fruit()
    fruit.showInfo()

    val apple = Apple()
    apple.showInfo()

    val pear = Pear()
    pear.showInfo()
}