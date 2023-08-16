package Tasks.Tasks200

fun main() {
    var ch = 'A'
    val ss = "AEIOU"
    var cur_ss: String

    while (ch != 'Z') {
        cur_ss = ch.toString()
        if (ss.contains(cur_ss)) {
            ch++
            continue
        }
        println(ch)
        ch++
    }
}