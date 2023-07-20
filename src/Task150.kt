import java.util.*

fun main() {
    val nn = (Math.random() * 10).toInt()
    var curNN: Int

    val scanner = Scanner(System.`in`)


    while (true) {
        print("Input number: ")
        curNN = scanner.nextInt()
        if (curNN == nn) {
            println("Congratulations! You guessed the number!")
            break
        } else if (curNN < nn) {
            println("The hidden number is bigger!")
        } else {
            println("The hidden number is less!")
        }
    }
}