import MyMethods.MyCollections

fun main() {
    val list = MyCollections().getMasRandomInteger(50,100)
    for (i in list) {
        println(i)
    }

}