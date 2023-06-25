fun main() {
    val apple = Fruit("apple", "red", 250)
    println("Fruit: " + apple.name + ", color: " + apple.color + ", weight: " + apple.weight)
}

internal class Fruit(val name: String, val color: String, val weight: Int)