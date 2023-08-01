package Tasks.Tasks200

fun main() {
    val mas = arrayOf("red", "orange", "yellow", "green", "blue", "indigo", "violet")

    for (cc in mas) {
        if (cc.startsWith("o")) continue
        println(cc)
    }
}