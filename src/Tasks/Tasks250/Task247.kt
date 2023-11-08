package Tasks.Tasks250

import java.util.*

internal open class Figure247 {
    open fun showInfo() {
        println("Figure!")
    }
}

internal class Square247 : Figure247() {
    override fun showInfo() {
        super.showInfo()
        println("Square! Number of corners: 4")
    }
}

internal class Triangle247 : Figure247() {
    override fun showInfo() {
        super.showInfo()
        println("Triangle! Number of corners: 3")
    }
}

fun main() {
    val figures = ArrayList<Figure247>()

    val figure1: Figure247 = Square247()
    val figure2: Figure247 = Triangle247()

    figures.add(figure1)
    figures.add(figure2)

    for (figure in figures) {
        figure.showInfo()
    }
}