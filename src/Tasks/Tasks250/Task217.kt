package Tasks.Tasks250

internal open class Fox(var name: String) {
    open fun showInfo() {
        println("Fox - $name")
    }
}

internal class SuperFox(name: String) : Fox(name) {
    override fun showInfo() {
        super.showInfo()
        println("I am super Fox!")
    }
}

fun main() {
    val fox1 = Fox("Alice")
    val fox2 = Fox("Vera")
    val fox3 = Fox("Dora")

    fox1.showInfo()
    fox2.showInfo()
    fox3.showInfo()

    println()
    val sfox1 = SuperFox("Elza")
    val sfox2 = SuperFox("Nata")
    val sfox3 = SuperFox("Mura")

    sfox1.showInfo()
    sfox2.showInfo()
    sfox3.showInfo()
}