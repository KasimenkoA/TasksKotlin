package Tasks.Tasks200

fun main() {
    val mas = arrayOfNulls<String>(7)
    mas[0] = "monday"
    mas[1] = "tuesday"
    mas[2] = "wednesday"
    mas[3] = "thursday"
    mas[4] = "friday"
    mas[5] = "saturday"
    mas[6] = "sunday"

    for (mm in mas) {
        if (mm!!.length == 7) {
            println(mm)
        }
    }
}