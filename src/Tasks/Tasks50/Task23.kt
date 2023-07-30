fun main() {
    val list = arrayOf("January","February","March")

    var ssMax = list[0]
    var nnMax = list[0].length

    for (s in list) {
        if (s.length > nnMax)
        {
            nnMax = s.length
            ssMax = s
        }
    }

    println("Max string: $ssMax")
    println("Length: $nnMax")

}