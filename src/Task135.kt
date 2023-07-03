fun main() {
    val tank1 = Tank("T-34", 30, 4)
    val tank2 = Tank("Panther", 44, 5)
    val tank3 = Tank("Tiger", 57, 5)

    tank1.showInfo()
    tank2.showInfo()
    tank3.showInfo()
}

internal class Tank(private val name: String, private val weight: Int, private val crew: Int) {
    fun showInfo() {
        println("Tank: $name, weight: $weight, crew: $crew.")
    }
}