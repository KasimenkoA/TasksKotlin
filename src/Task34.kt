fun main() {
    val animal1 = Animal("dog",3)
    val animal2 = Animal("cat",1)

    println("${animal1.name} and ${animal2.name}")
}

class Animal(val name:String, var age:Int)
{

}