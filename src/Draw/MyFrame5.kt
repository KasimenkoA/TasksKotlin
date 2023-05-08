package Draw

import java.awt.BorderLayout
import java.awt.Color
import java.awt.Graphics
import java.awt.GridLayout
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JPanel

class MyFrame5 : JFrame() {
    init {
        setSize(600, 400)
        setLocationRelativeTo(null)
        title = "My frame"
        defaultCloseOperation = EXIT_ON_CLOSE
    }
}

class MyPanel5 : JPanel() {
    override fun paintComponent(g: Graphics) {
        super.paintComponent(g)

        g.color = Color.blue
        g.drawString("My string", 50, 100)
    }
}

fun main() {
    val myFrame = MyFrame5()

    val myPanel = MyPanel5()
    myFrame.add(myPanel)

    myFrame.isVisible = true
}