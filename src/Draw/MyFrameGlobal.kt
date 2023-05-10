package Draw

import java.awt.BorderLayout
import java.awt.Color
import java.awt.Dimension
import java.awt.GridLayout
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JPanel

class MyFrameGlobal: JFrame()
{
    init {
        setSize(600, 500)
        setLocationRelativeTo(null)
        title = "My global frame"
        defaultCloseOperation = EXIT_ON_CLOSE

        val panelButton = JPanel()
        panelButton.layout = GridLayout(2,4)

        val panelDraw = PanelDraw()
        panelDraw.preferredSize = Dimension(600, 400)

        val button1 = JButton("Button 1")
        button1.addActionListener { panelDraw.drawMyOval() }
        panelButton.add(button1)

        val button2 = JButton("Button 2")
        button2.addActionListener { panelDraw.drawClear()}
        panelButton.add(button2)

        val button3 = JButton("Button 3")
        panelButton.add(button3)

        val button4 = JButton("Button 4")
        panelButton.add(button4)

        val button5 = JButton("Button 5")
        panelButton.add(button5)

        val button6 = JButton("Button 6")
        panelButton.add(button6)

        val button7 = JButton("Button 7")
        panelButton.add(button7)

        val button8 = JButton("Button 8")
        panelButton.add(button8)

        add(panelButton, BorderLayout.NORTH)
        add(panelDraw, BorderLayout.SOUTH)
    }

}

fun main() {

    val frame = MyFrameGlobal()
    frame.isVisible = true

}

class PanelDraw: JPanel()
{
    public fun drawMyOval()
    {
        val g = graphics
        g.color = Color.blue
        g.fillOval(200, 150, 90, 80)
    }

    public fun drawClear()
    {
        removeAll()
        repaint()
    }


}