package Tasks.Tasks200

fun main() {
    val nn = 2
    var rr: Double
    for (i in 1..10) {
        rr = Math.pow(nn.toDouble(), i.toDouble())
        println("$nn pow $i = $rr")
    }
}