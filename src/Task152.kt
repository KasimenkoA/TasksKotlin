fun main() {
    var even_sum = 0

    for (i in 1..10) {
        if (i % 2 == 0) even_sum += i
    }

    println("Sum: $even_sum")
}