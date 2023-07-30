import MyMethods.MyCollections

fun main() {
    val list = MyCollections().getPupilsNames()

    for (s in list) {
        println(s)
    }
}