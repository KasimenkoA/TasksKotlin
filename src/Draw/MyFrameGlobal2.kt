package Draw

import java.awt.*
import java.awt.geom.Ellipse2D
import java.util.*
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JPanel

class MyFrameGlobal2 : JFrame() {
    private var panelDraw: PanelDraw2
    var button1: JButton
    var button2: JButton
    var button3: JButton
    var button4: JButton
    var button5: JButton
    var button6: JButton
    var button7: JButton
    var button8: JButton


    init {
        title = "My global frame"
        setSize(600, 500)
        setLocationRelativeTo(null)
        defaultCloseOperation = EXIT_ON_CLOSE

        val panelButton = JPanel()
        panelButton.layout = GridLayout(2, 4)

        panelDraw = PanelDraw2()

        button1 = JButton("Button 1")
        button1.addActionListener { panelDraw.drawCircle() }
        panelButton.add(button1)

        button2 = JButton("Button 2")
        panelButton.add(button2)

        button3 = JButton("Button 3")
        panelButton.add(button3)

        button4 = JButton("Button 4")
        panelButton.add(button4)

        button5 = JButton("Button 5")
        panelButton.add(button5)

        button6 = JButton("Button 6")
        panelButton.add(button6)

        button7 = JButton("Button 7")
        panelButton.add(button7)

        button8 = JButton("Button 8")
        panelButton.add(button8)

        add(panelButton, BorderLayout.NORTH)
        add(panelDraw, BorderLayout.SOUTH)
    }
}

class MyCanvas : Canvas() {
    val shapes: ArrayList<Shape>
    override fun paint(g: Graphics) {
        val g2d = g as Graphics2D
        for (shape in shapes) {
            g2d.fill(shape)
        }
    }

    init {
        shapes = ArrayList()
    }
}

private class PanelDraw2: JPanel()
{
    private val canvas: MyCanvas
    init {
        preferredSize = Dimension(600, 400)
        canvas = MyCanvas()
        canvas.preferredSize = Dimension(600, 400)
        add(canvas, BorderLayout.CENTER)
    }

    fun drawCircle() {
        val ellipse2D: Ellipse2D = Ellipse2D.Double(100.0, 100.0, 60.0, 60.0)
        canvas.shapes.add(ellipse2D)
        canvas.repaint()
    }

}

fun main() {
    val frame = MyFrameGlobal2()
    frame.isVisible = true
}