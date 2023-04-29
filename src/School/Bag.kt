package School

class Bag(var firm: String = "",var color: String = "",var pencilBox: PencilBox = PencilBox()) {
    fun getInfo():Unit{
        println("Bag ${this.firm}, color ${this.color}.")
        println("Bag contains:")
        this.pencilBox.getInfo()
    }
}