package Draw

import java.awt.*
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import java.awt.geom.Ellipse2D
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JPanel

class MyFrameMix : JFrame() {
    var panelDraw: PanelDrawMix
    var button1: JButton
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
            drawFigure()
        }
    }

    private fun drawFigure() {
        val minX: Int = Math.min(startX, endX)
        val minY: Int = Math.min(startY, endY)
        val maxX: Int = Math.max(startX, endX)
        val maxY: Int = Math.max(startY, endY)

        val g2 = panelDraw.graphics as Graphics2D
        val ellipse2D: Ellipse2D = Ellipse2D.Double(
            minX.toDouble(), minY.toDouble(), (maxX - minX).toDouble(),
            (maxY - minY).toDouble()
        )
        g2.draw(ellipse2D)
    }
}




class PanelDrawMix : JPanel() {
    fun fillBackground() {
        background = Color.PINK
    }
}

fun main() {
    val frame = MyFrameMix()
    frame.isVisible = true
}