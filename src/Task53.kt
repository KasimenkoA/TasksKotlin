import School.Pupil
import java.util.*

fun main() {
    val pupil = Pupil()

    val scanner: Scanner = Scanner(System.`in`)
    print("Input pupil name: ")
    pupil.name = scanner.nextLine()

    print("Input pupil age: ")
    pupil.age = scanner.nextInt()

    pupil.getInfo()
}