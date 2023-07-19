fun main() {
    var i = 1
    while (++i <= 20) {
        if (i % 2 == 1) continue
        println(i)
    }
}