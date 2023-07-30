fun main() {
    print("What's your name: ")
    val name = readLine()

    print("How old are you? ")
    val age = readLine()?.toInt()

    println("Your name is $name. You're $age years old.")
}