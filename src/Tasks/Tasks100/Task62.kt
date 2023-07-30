import java.io.File
import java.util.*
import javax.swing.JFileChooser

fun main() {
    val jFileChooser = JFileChooser()
    val res = jFileChooser.showOpenDialog(null)

    if (res == JFileChooser.APPROVE_OPTION)
    {
        val file = jFileChooser.selectedFile
        val scanner: Scanner = Scanner(file)
        while (scanner.hasNext())
        {
            println(scanner.nextLine())
        }
        scanner.close()
    }
}