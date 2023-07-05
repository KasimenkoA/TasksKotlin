fun main() {
    val car1 = Car("Toyota", 1991, "gray")
    val car2 = Car("Nissan", 2004, "black")
    val car3 = Car("Mercedes", 2050, "coral")

    car1.showInfo()
    car2.showInfo()
    car3.showInfo()
}

internal class Car(val make: String, val year: Int, val color: String) {

    fun showInfo() {
        println("Car: $make. Year: $year. Color: $color")
    }
}