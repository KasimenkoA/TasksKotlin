package Tasks.Tasks200

fun main() {
    var nn: Int
    for (i in 0..9) {
        nn = (Math.random() * 100).toInt()
        if (nn > 50) continue
        println(nn)
    }
}