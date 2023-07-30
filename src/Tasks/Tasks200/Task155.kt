fun main() {
    var a1 = 0
    var a2 = 1
    var ff: Int

    for (i in 0..29) {
        ff = a1 + a2
        println(ff)
        a1 = a2
        a2 = ff
    }
}