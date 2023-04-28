import School.Pupil

fun main() {
    val list:ArrayList<Pupil> = arrayListOf()
    for (i in 0 until 100)
        {
            list.add(Pupil())
        }

    var sum_age = 0
    for (pupil in list) {
        pupil.getInfo()
        sum_age += pupil.age
    }

    println()
    println("Average pupils age: ${sum_age/100}")
}