import MyMethods.MyCollections

fun main() {
    val textBooks = MyCollections().getTextbooks()
    for (textBook in textBooks) {
        println(textBook)
    }
}