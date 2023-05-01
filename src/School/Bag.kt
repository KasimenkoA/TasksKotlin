package School

class Bag(var firm: String = "",var color: String = "",var pencilBox: PencilBox = PencilBox(),var textbooks: ArrayList<String> = ArrayList()) {
    fun getInfo():Unit{
        println("Bag ${this.firm}, color ${this.color}.")
        println("Bag contains:")
        this.pencilBox.getInfo()
        println("Textbooks:")
        for (textbook in this.textbooks) {
            println(textbook)
        }
    }
}