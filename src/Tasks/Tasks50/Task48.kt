import School.Pupil

fun main() {
    val list = arrayListOf<Pupil>()

    list.add(Pupil("Bob",9))
    list.add(Pupil("Thomas",12))
    list.add(Pupil("Elizabeth",10))

    for (pupil in list) {
        pupil.getInfo()
    }
}