package Draw

import MyMethods.MyCollections
import java.awt.*
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.geom.Ellipse2D
import java.util.*
import javax.swing.*

class MyFrameGlobal2 : JFrame() {
    private var panelDraw: PanelDraw2
    private var button1: JButton
    private var button2: JButton
    private var button3: JButton
    private var button4: JButton
    private var button5: JButton
    private var button6: JButton
    private var button7: JButton
    private var button8: JButton


    init {
        title = "My global frame"
        setSize(600, 500)
        setLocationRelativeTo(null)
        defaultCloseOperation = EXIT_ON_CLOSE

        val panelButton = JPanel()
        panelButton.layout = GridLayout(2, 4)

        val panelEdit = JPanel()
        panelEdit.preferredSize = Dimension(600, 100)
        val label = JLabel("Width:")
        panelEdit.add(label)
        val textField = JTextField("90")
        textField.columns = 5
        panelEdit.add(textField)

        val labelColor = JLabel("Color:")
        val buttonColor = JButton("Select color")
        buttonColor.addActionListener {
            val curColor = JColorChooser.showDialog(null, "Select color", Color.white)
            buttonColor.background = curColor
        }
        panelEdit.add(labelColor)
        panelEdit.add(buttonColor)

        panelDraw = PanelDraw2(textField)

        button1 = JButton("Button 1")
        button1.addActionListener { panelDraw.drawCircle() }
        panelButton.add(button1)

        button2 = JButton("Button 2")
        button2.addActionListener { panelDraw.setEditSize() }
        panelButton.add(button2)

        button3 = JButton("Button 3")
        button3.addActionListener { panelDraw.drawRandomCircle()}
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
        add(panelEdit, BorderLayout.CENTER)
        add(panelDraw, BorderLayout.SOUTH)
    }
}

class MyCanvas : Canvas() {
    val shapes: ArrayList<Shape> = ArrayList()

    override fun paint(g: Graphics) {
        val g2d = g as Graphics2D
        g2d.color = Color.CYAN

        for (shape in shapes) {
            g2d.fill(shape)
        }
    }
}

private class PanelDraw2(private var textField: JTextField) : JPanel()
{
    private val canvas: MyCanvas
    init {
        preferredSize = Dimension(600, 390)
        canvas = MyCanvas()
        canvas.preferredSize = Dimension(600, 390)
        add(canvas, BorderLayout.CENTER)
    }

    fun drawCircle() {
        val ellipse2D: Ellipse2D = Ellipse2D.Double(100.0, 100.0, 60.0, 60.0)
        canvas.shapes.add(ellipse2D)
        canvas.repaint()
    }

    fun setEditSize() {
        val size = textField.text.toInt()
        for (shape in canvas.shapes) {
            if (shape is Ellipse2D) {
                val newX = shape.x - (size - shape.width) / 2 // вычисляем новое положение X
                val newY = shape.y - (size - shape.height) / 2 // вычисляем новое положение Y
                shape.setFrame(newX, newY, size.toDouble(), size.toDouble())
            }
        }
        canvas.repaint()
    }

    fun drawRandomCircle() {
        val x: Int = MyCollections().getRandomFromTo(50, 500)
        val y: Int = MyCollections().getRandomFromTo(50, 300)
        val size: Int = MyCollections().getRandomFromTo(10, 250)
        val ellipse2D: Ellipse2D = Ellipse2D.Double(x.toDouble(), y.toDouble(), size.toDouble(), size.toDouble())
        canvas.shapes.add(ellipse2D)
        canvas.repaint()
    }

}

fun main() {
    val frame = MyFrameGlobal2()
    frame.isVisible = true
}