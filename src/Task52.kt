import School.Pupil

fun main() {
    val list1 = arrayListOf<Pupil>()
    val list2 = arrayListOf<Pupil>()

    for (i in 0 until 100)
        {
            list1.add(Pupil())
        }

    for (pupil in list1)
    {
        if (pupil.name.equals("Adam")) list2.add(pupil)
    }

    for (pupil in list2) pupil.getInfo()
}