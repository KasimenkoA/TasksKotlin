fun main() {
    var command = "C:\\Program Files (x86)\\Winamp\\winamp.exe"
    val playlist = "E:\\My music\\Playlist\\ChessQuick.m3u"
    var pb = ProcessBuilder(command, playlist)
    pb.start()

    command = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe"
    val address = "https://lichess.org"
    pb = ProcessBuilder(command, "-url", address)
    pb.start()
}