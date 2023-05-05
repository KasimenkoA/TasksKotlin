package Draw

import java.awt.Color
import java.awt.Graphics
import java.awt.Polygon
import javax.swing.JFrame
import javax.swing.JPanel

class MyFrame3 : JFrame() {
    init {
        setSize(600, 400)
        setLocationRelativeTo(null)
        title = "My frame"
        defaultCloseOperation = EXIT_ON_CLOSE
    }
}

class MyPanel3 : JPanel() {
    override fun paintComponent(g: Graphics) {
        super.paintComponent(g)

        val masx = IntArray(3)
        masx[0] = 100
        masx[1] = 250
        masx[2] = 400

        val masy = IntArray(3)
        masy[0] = 300
        masy[1] = 100
        masy[2] = 300

        val pol = Polygon(masx,masy,3)

        g.color = Color.green;
        g.drawPolygon( pol )
    }

}

fun main() {
    val myFrame = MyFrame3()

    val myPanel = MyPanel3()
    myFrame.add(myPanel)

    myFrame.isVisible = true
}