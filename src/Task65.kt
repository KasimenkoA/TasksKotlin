import MyMethods.MyCollections

fun main() {
    val pencilBoxes = MyCollections().getPencilBoxItems()

    for (pb in pencilBoxes) pb.getInfo()
}