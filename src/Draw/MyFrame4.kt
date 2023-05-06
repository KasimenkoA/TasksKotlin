package Draw

import java.awt.Color
import java.awt.Graphics
import java.awt.Polygon
import javax.swing.JFrame
import javax.swing.JPanel

class MyFrame4 : JFrame() {
    init {
        setSize(600, 400)
        setLocationRelativeTo(null)
        title = "My frame"
        defaultCloseOperation = EXIT_ON_CLOSE
    }
}

class MyPanel4 : JPanel() {
    override fun paintComponent(g: Graphics) {
        super.paintComponent(g)

        val x1 = intArrayOf(300, 100, 300)
        val y1 = intArrayOf(50, 150, 150)
        g.color = Color.yellow
//        g.drawPolygon(x1, y1, 3)
        g.fillPolygon(x1, y1, 3)

        val x2 = intArrayOf(300, 100, 300)
        val y2 = intArrayOf(200, 300, 300)
        g.color = Color.green
//        g.drawPolygon(x2, y2, 3)
        g.fillPolygon(x2, y2, 3)

        val x3 = intArrayOf(400, 400, 500)
        val y3 = intArrayOf(50, 300, 50)
        g.color = Color.red
//        g.drawPolygon(x3, y3, 3)
        g.fillPolygon(x3, y3, 3)
    }

}

fun main() {
    val myFrame = MyFrame4()

    val myPanel = MyPanel4()
    myFrame.add(myPanel)

    myFrame.isVisible = true
}