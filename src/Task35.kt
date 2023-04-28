fun main() {
    val fig1 = Figure("circle",10,"red")
    println("${fig1.name} ${fig1.color}")

    val fig2 = Figure("rectangle",16,"brown")
    println("${fig2.name} ${fig2.color}")

    val fig3 = Figure("triangle",12,"pink")
    println("${fig3.name} ${fig3.color}")
}

class Figure (_name: String, _square: Int, _color: String)
{
    val name: String = _name
    val square: Int = _square
    val color: String = _color
}