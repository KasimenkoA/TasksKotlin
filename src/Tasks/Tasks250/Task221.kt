package Tasks.Tasks250

internal interface Animal {
    fun eat()
    fun travel()
}

internal class Elephant : Animal {
    override fun eat() {
        println("The elephant is eating.")
    }

    override fun travel() {
        println("The elephant is traveling.")
    }
}

fun main() {

    val elephant = Elephant()
    elephant.eat()
    elephant.travel()

}