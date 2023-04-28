import MyMethods.MyCollections
import School.Pupil

fun main() {

    val names = MyCollections().getPupilsNames()
    var nn = (Math.random()*names.size).toInt()
    val name = names[nn]
    val age = MyCollections().getRandomFromTo(8,15)

    val pupil = Pupil(name,age)
    println("Pupil ${pupil.name}, age ${pupil.age}.")

}