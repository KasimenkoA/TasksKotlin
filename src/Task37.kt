import MyMethods.MyCollections

fun main() {
    val list = MyCollections().getMasRandomInteger(100,100)

    for (i in list) {
        println(i)
    }
}