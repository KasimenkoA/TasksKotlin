package Draw

import java.awt.*
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JPanel

class MyFrameGlobal(): JFrame()
{
    companion object{
        var curX:Int = 0
        var curY:Int = 0
    }

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
        //button2.addActionListener { panelDraw.drawClear()}
        button2.addActionListener {panelDraw.moveOval()}
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

    public fun moveOval()
    {
        val g = graphics
        g.color = Color.green

        MyFrameGlobal.curX = 0
        MyFrameGlobal.curY = 0

        while (true) {
            g.clearRect(0, 0, width, height)
            g.fillOval(MyFrameGlobal.curX, MyFrameGlobal.curY, 90, 80)
            try {
                Thread.sleep(10)
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
            MyFrameGlobal.curX++
            MyFrameGlobal.curY++
            if (MyFrameGlobal.curX >= width || MyFrameGlobal.curY >= height) {
                break
            }
        }

    }


}