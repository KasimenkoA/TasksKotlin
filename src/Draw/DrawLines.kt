package Draw

import Draw.DrawLines.MyLine
import java.awt.Color
import java.awt.Graphics
import java.awt.event.*
import java.util.*
import javax.swing.JFrame
import javax.swing.JPanel

fun main(args: Array<String>) {
    val frame = DrawLines()
    frame.isVisible = true
}

class DrawLines : JFrame() {
    var startX = 0
    var startY = 0
    var endX = 0
    var endY = 0

    var myLines: ArrayList<MyLine>

    class MyLine(var startX: Int, var startY: Int, var endX: Int, var endY: Int)

    init {
        title = "Draw lines"
        setSize(600, 500)
        setLocationRelativeTo(null)
        defaultCloseOperation = EXIT_ON_CLOSE

        myLines = ArrayList()

        val panel: JPanel = object : JPanel() {
            override fun paintComponent(g: Graphics) {
                super.paintComponent(g)
                g.color = Color.blue
                g.drawLine(startX, startY, endX, endY)

                for (myLine in myLines) {
                    g.drawLine(myLine.startX, myLine.startY, myLine.endX, myLine.endY)
                }
            }
        }
        val mouseListener: MouseListener = object : MouseAdapter() {
            override fun mousePressed(e: MouseEvent) {
                startX = e.x
                startY = e.y
                endX = startX
                endY = startY
            }

            override fun mouseReleased(e: MouseEvent) {
                endX = e.x
                endY = e.y

                myLines.add(MyLine(startX, startY, endX, endY))
                panel.repaint()
            }
        }
        val mouseMotionListener: MouseMotionListener = object : MouseMotionAdapter() {
            override fun mouseDragged(e: MouseEvent) {
                super.mouseDragged(e)
                endX = e.x
                endY = e.y
                panel.repaint()
            }
        }
        panel.addMouseListener(mouseListener)
        panel.addMouseMotionListener(mouseMotionListener)
        add(panel)
    }
}