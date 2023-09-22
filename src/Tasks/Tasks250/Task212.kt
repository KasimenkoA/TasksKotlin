package Tasks.Tasks250

import java.io.FileReader

fun main() {
    val fr = FileReader("test211.txt")
    var ii: Int

    while (fr.read().also { ii = it } != -1) {
        println(ii)
    }

    fr.close()
}