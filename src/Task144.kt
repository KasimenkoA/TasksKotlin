import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter your age: ")
    val age = scanner.nextInt()

    print("Enter your skating level: (1 - BEGINNER, 2 - MEDIUM, 3 - ADVANCED) ")
    val level = scanner.nextInt()

    if (age > 5 && level > 1) {
        println("You can go to the skating rink.")
    } else {
        println("You can't go to the rink.")
    }
}