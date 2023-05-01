import School.Pupil

fun main() {
    val pupils = arrayListOf<Pupil>()

    for (i in 0 until 100)
        {
            pupils.add(Pupil())
        }

    var max_age = Integer.MIN_VALUE
    for (pupil in pupils) {
        if (pupil.age > max_age) max_age = pupil.age
    }

    for (pupil in pupils) {
        if (pupil.age == max_age) println("Pupil ${pupil.name}, age: ${pupil.age}")
    }
}