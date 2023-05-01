package Draw

import java.awt.Graphics
import javax.swing.JFrame
import javax.swing.JPanel

class MyFrame: JFrame()
{
    init{
        setSize(600,300)
        setLocationRelativeTo(null)
        title = "My frame"
        defaultCloseOperation = EXIT_ON_CLOSE
    }
}

class MyPanel: JPanel()
{
    override fun paintComponent(g: Graphics) {
        super.paintComponent(g)

        g.drawOval(100,150,60,60)
    }
}

fun main() {
    val myFrame = MyFrame()

    val myPanel = MyPanel()
    myFrame.add(myPanel)

    myFrame.isVisible = true


}