package Tasks.Tasks150

fun main() {
    val dog1 = Dog("Bobic", "boxer", 7)
    val dog2 = Dog("Tarzan", "setter", 37)
    val dog3 = Dog("Mavr", "diver", 28)

    dog1.showInfo()
    dog2.showInfo()
    dog3.showInfo()

}

internal class Dog(var name: String, var breed: String, var age: Int) {
    val isPuppy: Boolean
        get() = age < 12

    fun showInfo() {
        println("Dog: $name, breed: $breed, age: $age.")
        if (isPuppy) {
            println("It is puppy.")
        } else {
            println("It's not a putty.")
        }
    }
}