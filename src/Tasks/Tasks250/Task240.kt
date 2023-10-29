package Tasks.Tasks250

import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream

fun main() {
    val map: MutableMap<Int, String> = HashMap()
    map[1] = "Mercury"
    map[2] = "Venus"
    map[3] = "Earth"
    map[4] = "Mars"
    map[5] = "Jupiter"

    val file = FileOutputStream("Planets.fos")
    val `object` = ObjectOutputStream(file)
    `object`.writeObject(map)
    `object`.close()

    var map2: Map<Int?, String?> = HashMap()

    val file2 = FileInputStream("Planets.fos")
    val object2 = ObjectInputStream(file2)

    map2 = object2.readObject() as Map<Int?, String?>
    for (value in map2.values) {
        println(value)
    }
}