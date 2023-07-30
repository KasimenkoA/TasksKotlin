import MyMethods.MyCollections

fun main() {
    val list = MyCollections().getPupilsNames()

    val rr = (Math.random()*20).toInt()
    val name = list[rr]

    val age = (Math.random()*6).toInt() + 10

    println("Pupil $name. Age: $age.")
}