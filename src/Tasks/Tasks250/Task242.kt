package Tasks.Tasks250

import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.URL

fun main() {
    val url = URL("https://www.google.com")
    val urlConnection = url.openConnection()

    val `in` = BufferedReader(InputStreamReader(urlConnection.getInputStream()))

    var str: String?
    while (`in`.readLine().also { str = it } != null) {
        println(str)
    }
}