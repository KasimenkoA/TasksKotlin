package Tasks.Tasks250

import java.io.FileInputStream
import java.io.ObjectInputStream
import java.util.ArrayList

fun main() {
    var arrayList = ArrayList<String?>()

    val file = FileInputStream("Fruits.fos")
    val `object` = ObjectInputStream(file)

    arrayList = `object`.readObject() as ArrayList<String?>

    for (s in arrayList) {
        println(s)
    }
}