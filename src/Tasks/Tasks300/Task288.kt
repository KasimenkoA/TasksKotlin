package Tasks.Tasks300

import javax.swing.JOptionPane

fun main() {
    val name = JOptionPane.showInputDialog("What is your name?")
    println(name)

    val age = JOptionPane.showInputDialog("How old are you?").toInt()
    println(age)

    val height = JOptionPane.showInputDialog("What is your height?").toDouble()
    println(height)

    System.exit(0)
}