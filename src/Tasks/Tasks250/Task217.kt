package Tasks.Tasks250

internal class Fox(var name: String) {
    fun showInfo() {
        println("Fox - $name")
    }
}

fun main() {
    val fox1 = Fox("Alice")
    val fox2 = Fox("Vera")
    val fox3 = Fox("Dora")

    fox1.showInfo()
    fox2.showInfo()
    fox3.showInfo()
}