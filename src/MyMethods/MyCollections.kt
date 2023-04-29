package MyMethods

import School.Bag
import School.PencilBox

class MyCollections {

    fun getMasRandomInteger(size:Int,bound:Int):ArrayList<Int>
    {
        var list = arrayListOf<Int>()

        for (i in 0 until size) list.add((Math.random()*bound).toInt())

        return list
    }

    fun getRandomFromTo(i_from:Int,i_to:Int):Int
    {
        if (i_to<i_from) return i_from

        val bound = i_to - i_from + 1
        var rr = i_from + (Math.random()*bound).toInt()

        return rr
    }

    fun getColors():ArrayList<String>
    {
        var list = arrayListOf<String>()

        list.add("red")
        list.add("orange")
        list.add("yellow")
        list.add("green")
        list.add("cyan")
        list.add("blue")
        list.add("violet")
        list.add("white")
        list.add("black")
        list.add("brown")

        return list
    }

    fun getFirms():ArrayList<String>
    {
        var list = arrayListOf<String>()

        list.add("Berlingo")
        list.add("Brauberg")
        list.add("Centropen")
        list.add("Hatber")
        list.add("Erich Krause")
        list.add("Herlitz Loop")
        list.add("Ergoflex")
        list.add("ZNATOK")
        list.add("Tiger Family")
        list.add("SkyName")

        return list
    }

    fun getPupilsNames():ArrayList<String>
    {
        var list = arrayListOf<String>()

        list.add("Katherine")
        list.add("Barbara")
        list.add("Amanda")
        list.add("Victoria")
        list.add("Irene")
        list.add("Miranda")
        list.add("Sophia")
        list.add("Margaret")
        list.add("Vivian")
        list.add("Emma")

        list.add("Adam")
        list.add("Andrew")
        list.add("Arnold")
        list.add("Brian")
        list.add("David")
        list.add("Gerald")
        list.add("Harry")
        list.add("Jason")
        list.add("Norman")
        list.add("Thomas")
        
        return list
    }

    fun getRandomBag():Bag
    {
        val bag = Bag()
        var nn = 0

        val firms = getFirms()
        nn = (Math.random()*firms.size).toInt()
        bag.firm = firms.get(nn)

        val colors = getColors()
        nn = (Math.random()*colors.size).toInt()
        bag.color = colors.get(nn)

        bag.pencilBox = PencilBox()

        return bag
    }

}