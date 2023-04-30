import MyMethods.MyCollections

fun main() {
    val textBooks = MyCollections().getRandomTextbooks()
    for (textBook in textBooks) {
        println(textBook)
    }
}