package School

import MyMethods.MyCollections

class PencilBox(var color:String = "",var items:ArrayList<String> = ArrayList<String>()) {
    constructor():this("")
    {
        val colors = MyCollections().getColors()
        var nn = (Math.random()*colors.size).toInt()
        this.color = colors[nn]

        this.items = MyCollections().getRandomPencilBoxItems()
    }

    fun getInfo()
    {
        println("Pencilbox ${this.color}.")
        println("Pencil box contents:")
        for (ss in this.items) println(ss)
    }
}