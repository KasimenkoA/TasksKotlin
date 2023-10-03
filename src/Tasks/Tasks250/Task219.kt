package Tasks.Tasks250

internal open class Boy(var name: String) {
    open fun showInfo() {
        println(name + " - boy.")
    }
}

internal class SuperBoy(name: String) : Boy(name) {
    override fun showInfo() {
        super.showInfo()
        println("This is super boy!")
    }
}

fun main() {
    val boy1 = Boy("Nicolas")
    boy1.showInfo()

    println()
    val superBoy1 = SuperBoy("Piter")
    superBoy1.showInfo()
}