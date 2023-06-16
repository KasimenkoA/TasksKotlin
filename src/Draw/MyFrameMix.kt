package Draw

import java.awt.*
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import java.awt.event.MouseMotionAdapter
import java.awt.geom.Ellipse2D
import java.util.*
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JPanel

class MyFrameMix : JFrame() {
    var panelDraw: PanelDrawMix
    var button1: JButton
    var tempShape: Shape? = null
    var shapes = ArrayList<Shape>()
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

        add(panelButton, BorderLayout.NORTH)
        add(panelDraw, BorderLayout.SOUTH)

        startX = 0
        startY = 0
        endX = 0
        endY = 0
    }

    inner class MyMouseAdapter : MouseAdapter() {
        override fun mousePressed(e: MouseEvent) {
            startX = e.x
            startY = e.y
        }

        override fun mouseReleased(e: MouseEvent) {
            endX = e.x
            endY = e.y
            getFigure()
        }
    }

    inner class MyMouseMotionListener : MouseMotionAdapter() {
        override fun mouseDragged(e: MouseEvent) {
            endX = e.x
            endY = e.y
            tempShape = getFigure()
            repaint()
        }
    }


    private fun getFigure(): Shape {
        val minX = Math.min(startX, endX)
        val minY = Math.min(startY, endY)
        val maxX = Math.max(startX, endX)
        val maxY = Math.max(startY, endY)
        return Ellipse2D.Double(
            minX.toDouble(), minY.toDouble(), (maxX - minX).toDouble(),
            (maxY - minY).toDouble()
        )
    }

    inner class PanelDrawMix : JPanel() {
        override fun paint(g: Graphics) {
            val g2 = g as Graphics2D
            if (tempShape != null) {
                g2.draw(tempShape)
            }
            for (shape in shapes) {
                g2.draw(shape)
            }
        }

        fun fillBackground() {
            background = Color.PINK
        }
    }
}




fun main() {
    val frame = MyFrameMix()
    frame.isVisible = true
}