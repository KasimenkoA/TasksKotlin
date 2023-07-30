package Tasks.Tasks150

fun main() {
    val cat = Cat("Barsic", 4)

    println(cat.age)

    cat.isSleeping = true
    cat.showInfo()

    cat.isSleeping = false
    cat.showInfo()
}

internal class Cat(private val name: String, var age: Int) {
    var isSleeping = false
    fun showInfo() {
        println("Cat: $name, age: $age, is sleeping: $isSleeping")
    }
}