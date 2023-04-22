fun main() {
    var array = arrayOfNulls<String>(9)
    var nn = 0

    for (i in 0 until array.size)
    {
        nn = (Math.random()*30).toInt();
        when
        {
            0<=nn && nn<=10 -> array[i] = "White"
            11<=nn && nn<=20 -> array[i] = "Blue"
            21<=nn && nn<=30 -> array[i] = "White"
        }
    }

    for (s in array) {
        println(s)
    }
}