package Tasks.Tasks150

fun main() {
    val miniCar = MiniCar("Citroen")
    miniCar.drive()
}

internal class MiniCar(private val make: String) {
    fun drive() {
        println("I'm driving a $make.")
    }
}