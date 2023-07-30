package Tasks.Tasks150

fun main() {

    val movie1 = Movie("Undefeated", "drama", 113)
    val movie2 = Movie("Hobbit", "fantasy", 209)

    movie1.showInfo()
    movie2.showInfo()

}

internal class Movie(val title: String, val genre: String, val length: Int) {
    val lengthHour: String
        get() {
            val hour = length / 60
            val min = length - hour * 60
            return "$hour hours, $min min."
        }

    fun showInfo() {
        println("Film: $title, genre: $genre, length: $lengthHour")
    }
}