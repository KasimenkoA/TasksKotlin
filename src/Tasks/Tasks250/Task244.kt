package Tasks.Tasks250

open class Caterpillar {
    fun showInfo() {
        println("Caterpillar is crawling.")
    }    
}

public class SupCaterpillar : Caterpillar()
{
    fun showColor() {
        println("Caterpillar is green.")
    }
}

fun main() {
    val caterpillar = Caterpillar()
    caterpillar.showInfo()

    val  supCaterpillar = SupCaterpillar()
    supCaterpillar.showInfo()
    supCaterpillar.showColor()
}