package Tasks.Tasks300

fun main() {
    val map: MutableMap<Char, Int> = HashMap()

    val cc = arrayOf(
        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
        'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    )
    for (i in cc.indices) {
        map.put(cc[i],i)
    }

    for (entry in map.entries) {
        println("${entry.key} - ${entry.value}")
    }
}