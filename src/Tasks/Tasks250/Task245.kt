package Tasks.Tasks250

internal open class Cart {
    var wheels = 0

    open fun showInfo() {
        println("Cart with $wheels wheels.")
    }
}

internal class BigCart : Cart() {
    override fun showInfo() {
        println("Cart with " + super.wheels + " wheels and a roof.")
    }
}

fun main() {
    val cart = Cart()
    cart.wheels = 4
    cart.showInfo()

    println()

    val bigCart = BigCart()
    bigCart.wheels = 6
    bigCart.showInfo()
}