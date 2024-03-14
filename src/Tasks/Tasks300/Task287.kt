package Tasks.Tasks300

import java.util.*
import kotlin.collections.HashMap

fun main() {
    val map: MutableMap<String,Char> = HashMap()

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
        map.put(curSS,cc[i])
    }

    val scanner = Scanner(System.`in`)
    print("Input string: ")
    val ss = scanner.nextLine().lowercase(Locale.getDefault())

    var new_ss = ""
    var ii = 1
    while (ii <= ss.length) {
        curSS = ss.substring(ii - 1, ii + 1)
        new_ss = new_ss + map[curSS].toString()
        ii += 2
    }

    println(new_ss)
}