package Tasks.Tasks300

import java.util.*
import kotlin.collections.HashMap

fun main() {
    val map: MutableMap<Char, String> = HashMap()

    val cc = arrayOf(
        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
        'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' '
    )

    var curSS = ""
    var startIndex: Int
    for (i in cc.indices) {
        curSS = "0" + Integer.toString(i)
        startIndex = curSS.length - 2
        curSS = curSS.substring(startIndex)
        map.put(cc[i],curSS)
    }

    val scanner = Scanner(System.`in`)
    print("Input string: ")
    val ss = scanner.nextLine().lowercase(Locale.getDefault())

    var new_ss = ""
    var cur_ch: Char

    for (element in ss) {
        cur_ch = element
        new_ss += map[cur_ch]
    }

    println(new_ss)
}