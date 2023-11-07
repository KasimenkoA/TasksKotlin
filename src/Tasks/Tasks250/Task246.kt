package Tasks.Tasks250

internal open class Airplane {
    open fun showSpeed() {
        println("Airplane. Speed is 800 km per hour.")
    }
}

internal open class OrbitalPlane : Airplane() {
    override fun showSpeed() {
        println("Orbital plane. Speed is 20 000 km per hour.")
    }
}

internal class Spaceship : OrbitalPlane() {
    override fun showSpeed() {
        println("Spaceship. Speed is 30 000 km per hour.")
    }
}

fun main() {
    val airplane = Airplane()
    airplane.showSpeed()

    val orbitalPlane = OrbitalPlane()
    orbitalPlane.showSpeed()

    val spaceship = Spaceship()
    spaceship.showSpeed()
}