import java.io.File
import java.util.*

fun main() {
    val file = File("Test1.txt")

    val scanner: Scanner = Scanner(file)
    while (scanner.hasNext())
    {
        println(scanner.nextLine())
    }
    scanner.close()
}