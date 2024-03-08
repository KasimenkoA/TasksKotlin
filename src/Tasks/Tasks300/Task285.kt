package Tasks.Tasks300

fun main() {
    val map: MutableMap<Char, String> = HashMap()

    val cc = arrayOf(
        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
        'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    )

    var curSS = ""
    var startIndex: Int
    for (i in cc.indices) {
        curSS = "0" + Integer.toString(i)
        startIndex = curSS.length - 2
        curSS = curSS.substring(startIndex)
        map.put(cc[i],curSS)
    }

    for (entry in map.entries) {
        println("${entry.key} - ${entry.value}")
    }
}