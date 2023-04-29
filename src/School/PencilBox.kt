package School

import MyMethods.MyCollections

class PencilBox(var color:String = "") {
    constructor():this("")
    {
        val colors = MyCollections().getColors()
        var nn = (Math.random()*colors.size).toInt()
        this.color = colors[nn]
    }

    fun getInfo()
    {
        println("Pencilbox ${this.color}.")
    }
}