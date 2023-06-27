fun main() {
    val user1 = User("Vova", 10, "Beiker street, 7-1")
    val user2 = User("Oleg", 12, "Central, 5-13")
    val user3 = User("Tania", 8, "Progressive, 4-20")

    user1.showInfo()
    user2.showInfo()
    user3.showInfo()
}

internal class User(val name: String, val age: Int, val adress: String) {

    fun showInfo() {
        println("Name: $name, age: $age, adress: $adress.")
    }
}