import java.util.*

fun main() {
    val name: String = requestName()
    val age: Int = requestAge()

    println("Your name is $name, you are $age years old.")
}

fun requestName(): String {
    val scanner: Scanner = Scanner(System.`in`)
    print("Input name: ")
    return scanner.nextLine()
}

fun requestAge(): Int {
    val scanner: Scanner = Scanner(System.`in`)
    print("Input age: ")
    return scanner.nextInt()
}
