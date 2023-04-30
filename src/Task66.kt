import MyMethods.MyCollections

fun main() {
    val pencilBoxes = MyCollections().getRandomPencilBoxItems()
    for (pb in pencilBoxes) pb.getInfo()
}