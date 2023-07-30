fun main() {
    val spaceship1 = Spaceship("Apollo", Astronaut("Don"), Astronaut("Boris"))
    val spaceship2 = Spaceship("Jupiter", Astronaut("Tom"), Astronaut("Henk"))

    spaceship1.showInfo()
    spaceship2.showInfo()

}

internal class Astronaut(val name: String)

internal class Spaceship(
    private val name: String,
    private val astronaut1: Astronaut,
    private val astronaut2: Astronaut
) {
    fun showInfo() {
        println("Spaceship: " + name + ". Astonaut: " + astronaut1.name + ". Astonaut: " + astronaut2.name + ".")
    }
}
