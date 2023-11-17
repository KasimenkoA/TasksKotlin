package Tasks.Tasks300

internal abstract class Car253 {
    abstract val maxSpeed: Int
    abstract val enginePower: Int
}

internal class NissanDualis : Car253() {
    override val maxSpeed: Int
        get() = 185
    override val enginePower: Int
        get() = 137
}

internal class FordExplorer : Car253() {
    override val maxSpeed: Int
        get() = 229
    override val enginePower: Int
        get() = 400
}

internal class ToyotaSupra : Car253() {
    override val maxSpeed: Int
        get() = 266
    override val enginePower: Int
        get() = 387
}

fun main() {
    val nissanDualis = NissanDualis()
    val fordExplorer = FordExplorer()
    val toyotaSupra = ToyotaSupra()

    println("NissanDualis. Speed: ${nissanDualis.maxSpeed}. Power: ${nissanDualis.enginePower}.")
    println("FordExplorer. Speed: ${fordExplorer.maxSpeed}. Power: ${fordExplorer.enginePower}.")
    println("ToyotaSupra. Speed:  ${toyotaSupra.maxSpeed}.Power: ${toyotaSupra.enginePower}.")
}

