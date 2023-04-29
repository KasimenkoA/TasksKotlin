import java.io.BufferedWriter
import java.io.FileWriter

fun main() {
    val fw = FileWriter("Out1.txt")
    val bw = BufferedWriter(fw)

    bw.write("apple\n")
    bw.write("pear")

    bw.close()
}