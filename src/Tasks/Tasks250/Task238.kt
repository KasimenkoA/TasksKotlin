package Tasks.Tasks250

import java.io.FileOutputStream
import java.io.ObjectOutputStream
import java.util.*

fun main() {
    val arrayList = ArrayList<String>()
    arrayList.add("apple")
    arrayList.add("banana")
    arrayList.add("orange")
    arrayList.add("kiwi")
    arrayList.add("mango")

    val file = FileOutputStream("Fruits.fos")
    val `object` = ObjectOutputStream(file)
    `object`.writeObject(arrayList)
    `object`.close()
}