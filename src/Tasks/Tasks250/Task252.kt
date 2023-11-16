package Tasks.Tasks250

internal abstract class Animal252 {
    abstract val name: String
    abstract fun getAnimalName():String
}

internal class Cat(override val name: String) : Animal252() {
    override fun getAnimalName(): String {
        return "Cat: $name"
    }


}

internal class Dog(override val name: String) : Animal252() {
    override fun getAnimalName(): String {
        return "Dog: $name"
    }
}

fun main() {
    val cat = Cat("Barsic")
    println(cat.getAnimalName())

    val dog = Dog("Bobic")
    println(dog.getAnimalName())
}