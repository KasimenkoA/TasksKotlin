package Tasks.Tasks150

fun main() {
    val petAnimal = PetAnimal("Cow")
    petAnimal.makeSound()
}

internal class PetAnimal(private val name: String) {
    fun makeSound() {
        println("The $name makes a sound")
    }
}