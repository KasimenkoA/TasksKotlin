package School

class Bag(var firm: String = "",var color: String = "") {
    fun getInfo():Unit{
        println("Bag ${this.firm}, color ${this.color}.")
    }
}