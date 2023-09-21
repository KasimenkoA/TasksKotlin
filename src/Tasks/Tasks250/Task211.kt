package Tasks.Tasks250

import java.io.FileWriter

fun main() {
    val fw = FileWriter("test211.txt")

    var ss: String?

    for (i in 1..10) {
        ss = Integer.toString(i)
        fw.write(ss)
        fw.write("\n")
    }

    fw.close()
}