fun main() {
    var pb = ProcessBuilder("notepad.exe")
    pb.start()

    val command = "C:\\Program Files\\Mozilla Firefox\\firefox.exe"
    val address = "https://lichess.org"
    pb = ProcessBuilder(command, "-url", address)
    pb.start()
}