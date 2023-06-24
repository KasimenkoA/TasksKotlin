package Draw

import java.awt.*
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import java.awt.event.MouseMotionAdapter
import java.awt.geom.Arc2D
import java.awt.geom.Ellipse2D
import java.awt.geom.Line2D
import java.awt.geom.Rectangle2D
import java.util.*
import javax.swing.*

class MyFrameMix : JFrame() {
    var panelDraw: PanelDrawMix
    var button1: JButton
    var button2: JButton
    var tempShape: MyShape
    var curColor: Color
    var checkBox1: JCheckBox = JCheckBox("fill", false)
    var jTextField: JTextField = JTextField()
    var jComboBox: JComboBox<String> = JComboBox()

    var shapes = ArrayList<MyShape>()
    var startX = 0
    var startY = 0
    var endX = 0
    var endY = 0

    init {
        title = "My frame Mix"
        setSize(600, 500)
        setLocationRelativeTo(null)
        defaultCloseOperation = EXIT_ON_CLOSE

        val panelButton = JPanel()
        panelButton.layout = GridLayout(2, 4)

        panelDraw = PanelDrawMix()
        panelDraw.preferredSize = Dimension(600, 400)
        panelDraw.addMouseListener(MyMouseAdapter())
        panelDraw.addMouseMotionListener(MyMouseMotionListener())

        button1 = JButton("Button 1")
        button1.addActionListener { panelDraw.fillBackground() }
        panelButton.add(button1)

        button2 = JButton("Color")
        button2.addActionListener { panelDraw.selectColor() }
        panelButton.add(button2)

        panelButton.add(checkBox1)

        panelButton.add(jTextField)

        val masSS = arrayOf("line", "rectangle", "oval", "arc")
        jComboBox = JComboBox(masSS)
        panelButton.add(jComboBox)

        add(panelButton, BorderLayout.NORTH)
        add(panelDraw, BorderLayout.SOUTH)

        startX = 0
        startY = 0
        endX = 0
        endY = 0

        curColor = Color.BLACK
        tempShape = MyShape()
    }

    inner class MyMouseAdapter : MouseAdapter() {
        override fun mousePressed(e: MouseEvent) {
            startX = e.x
            startY = e.y
        }

        override fun mouseReleased(e: MouseEvent) {
            endX = e.x
            endY = e.y
            shapes.add(getMyShape())
        }
    }

    inner class MyMouseMotionListener : MouseMotionAdapter() {
        override fun mouseDragged(e: MouseEvent) {
            endX = e.x
            endY = e.y
            tempShape = getMyShape()
            repaint()
        }
    }


    private fun getFigure(): Shape {
        val minX = Math.min(startX, endX).toDouble()
        val minY = Math.min(startY, endY).toDouble()
        val maxX = Math.max(startX, endX).toDouble()
        val maxY = Math.max(startY, endY).toDouble()

        var shapeType = ""
        if (jComboBox.selectedItem != null) {
            shapeType = jComboBox.selectedItem as String
        }

        return when (shapeType)
                        {
                            "oval" -> Ellipse2D.Double(minX, minY, maxX - minX, maxY - minY )
                            "rectangle" -> Rectangle2D.Double( minX, minY, maxX - minX, maxY - minY )
                            "arc" -> Arc2D.Double( minX, minY, maxX - minX, maxY - minY, 0.0, 90.0, Arc2D.PIE )

            else -> Line2D.Double( minX, minY, maxX, maxY )
        }

    }

    private fun getMyShape(): MyShape {
        return MyShape()
    }

    inner class MyShape {
        var shape: Shape
        var color: Color
        var isFill: Boolean
        var lineWidth = 0

        init {
            color = curColor
            shape = getFigure()
            isFill = checkBox1.isSelected()

            lineWidth = 1
            val text = jTextField.text
            if (text.matches("\\d+".toRegex())) lineWidth = text.toInt()
        }
    }

    inner class PanelDrawMix : JPanel() {
        override fun paint(g: Graphics) {
            val g2 = g as Graphics2D


            g2.color = tempShape.color
            if (tempShape.lineWidth > 0) {
                g2.stroke = BasicStroke(tempShape.lineWidth.toFloat())
            }
            if (tempShape.isFill) {
                g2.fill(tempShape.shape)
            } else {
                g2.draw(tempShape.shape)
            }

            for (shape in shapes) {
                g2.color = shape.color
                if (shape.lineWidth > 0) {
                    g2.stroke = BasicStroke(shape.lineWidth.toFloat())
                }
                if (shape.isFill) {
                    g2.fill(shape.shape)
                } else {
                    g2.draw(shape.shape)
                }
            }
        }

        fun fillBackground() {
            background = Color.PINK
        }

        fun selectColor() {
            curColor = JColorChooser.showDialog(null, "Select color", Color.WHITE)
            button2.background = curColor
        }
    }
}


fun main() {
    val frame = MyFrameMix()
    frame.isVisible = true
}