package School

import MyMethods.MyCollections

class Pupil(var name:String, var age:Int = 0, var bag:Bag = Bag()) {
    constructor():this("",0, Bag())
    {
        val names = MyCollections().getPupilsNames()
        var nn = (Math.random()*names.size).toInt()
        this.name = names[nn]
        this.age = MyCollections().getRandomFromTo(8,14)
        this.bag = MyCollections().getRandomBag()
    }

    fun getInfo()
    {
        println("Pupil ${this.name}, age ${this.age}.")
        this.bag.getInfo()
    }
}