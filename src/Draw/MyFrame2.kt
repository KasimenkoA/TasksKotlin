package Draw

import java.awt.Graphics
import java.awt.Polygon
import javax.swing.JFrame
import javax.swing.JPanel

class MyFrame2 : JFrame() {
    init {
        setSize(600, 400)
        setLocationRelativeTo(null)
        title = "My frame"
        defaultCloseOperation = EXIT_ON_CLOSE
    }
}

class MyPanel2 : JPanel() {
    override fun paintComponent(g: Graphics) {
        super.paintComponent(g)

        val masx = IntArray(5)
        masx[0] = 100
        masx[1] = 250
        masx[2] = 400
        masx[3] = 100
        masx[4] = 400

        val masy = IntArray(5)
        masy[0] = 300
        masy[1] = 100
        masy[2] = 300
        masy[3] = 150
        masy[4] = 150

        val pol = Polygon(masx,masy,5)

        g.drawPolygon( pol )
    }

}

fun main() {
    val myFrame = MyFrame2()

    val myPanel = MyPanel2()
    myFrame.add(myPanel)

    myFrame.isVisible = true
}