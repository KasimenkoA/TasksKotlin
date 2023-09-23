package Tasks.Tasks250

import java.io.File

fun main() {
    val file = File("C:\\")
    val mas = file.list()

    for (mm in mas) {
        println(mm)
    }
}