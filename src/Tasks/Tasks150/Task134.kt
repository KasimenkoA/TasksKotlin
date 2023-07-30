package Tasks.Tasks150

fun main() {
    val bankAccount = BankAccount("125", "Alexey", 1000)
    bankAccount.addMoney(23)
    bankAccount.takeMoney(10)
    bankAccount.showRestMoney()
}

internal class BankAccount(var accountNumber: String, var ownerName: String, var balance: Int) {
    fun showRestMoney() {
        println("Total money: $balance")
    }

    fun addMoney(mm: Int) {
        balance += mm
        println("Add: $mm")
        showRestMoney()
    }

    fun takeMoney(mm: Int) {
        balance -= mm
        println("Take: $mm")
        showRestMoney()
    }
}