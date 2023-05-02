package Draw

import java.awt.Graphics
import javax.swing.JFrame
import javax.swing.JPanel

class MyFrame: JFrame()
{
    init{
        setSize(600,400)
        setLocationRelativeTo(null)
        title = "My frame"
        defaultCloseOperation = EXIT_ON_CLOSE
    }
}

class MyPanel: JPanel()
{
    override fun paintComponent(g: Graphics) {
        super.paintComponent(g)

        //g.drawOval(100,150,60,60)

        g.drawLine(100, 300, 200, 100)
        g.drawLine(200, 100, 300, 300)
        g.drawLine(300, 300, 100, 150)
        g.drawLine(100, 150, 300, 150)
        g.drawLine(300, 150, 100, 300)
    }
}

fun main() {
    val myFrame = MyFrame()

    val myPanel = MyPanel()
    myFrame.add(myPanel)

    myFrame.isVisible = true


}