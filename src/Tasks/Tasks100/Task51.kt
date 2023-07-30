import School.Pupil

fun main() {
    var pupil:Pupil;

    val list3 = arrayListOf<Pupil>()
    val list4 = arrayListOf<Pupil>()
    val list5 = arrayListOf<Pupil>()

    for (i in 0 until 100)
        {
            pupil = Pupil()
            when{
                pupil.age<10 -> list3.add(pupil)
                pupil.age==10 -> list4.add(pupil)
                else -> list5.add(pupil)
            }
        }

    println("Class 3:")
    for (pup in list3) pup.getInfo()
    println()

    println("Class 4:")
    for (pup in list4) pup.getInfo()
    println()

    println("Class 5:")
    for (pup in list5) pup.getInfo()
    println()
}