package Tasks.Tasks250

import java.net.URL

fun main() {
    val url = URL("https://www.google.com/")

    println("URL: $url")
    println("Protocol: " + url.protocol)
    println("Authority: " + url.authority)
    println("File name: " + url.file)
    println("Host: " + url.host)
    println("Path: " + url.path)
    println("Port: " + url.port)
    println("Default port: " + url.defaultPort)
    println("Query: " + url.query)
    println("Reference: " + url.ref)
}