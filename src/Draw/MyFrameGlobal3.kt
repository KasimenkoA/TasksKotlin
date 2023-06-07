package Draw

import MyMethods.MyCollections
import java.awt.*
import java.awt.geom.Ellipse2D
import java.util.*
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JPanel

class MyFrameGlobal3 : JFrame() {
    private var panelDraw: PanelDraw3
    private var button1: JButton
    private var button2: JButton
    private var button3: JButton
    private var button4: JButton
    private var button5: JButton
    private var button6: JButton
    private var button7: JButton
    private var button8: JButton

    init {
        title = "My global frame 3"
        setSize(600, 500)
        setLocationRelativeTo(null)
        defaultCloseOperation = EXIT_ON_CLOSE

        val panelButton = JPanel()
        panelButton.layout = GridLayout(2, 4)

        panelDraw = PanelDraw3()
        panelDraw.preferredSize = Dimension(600, 400)

        button1 = JButton("Button 1")
        button1.addActionListener { panelDraw.drawCircle() }
        panelButton.add(button1)

        button2 = JButton("Button 2")
        button2.addActionListener { panelDraw.drawCircles() }
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

        val service = Executors.newSingleThreadScheduledExecutor()
        service.scheduleWithFixedDelay(PanelRepaint(panelDraw), 100, 50, TimeUnit.MILLISECONDS)
    }

    class PanelRepaint(private val panelDraw: PanelDraw3) : Runnable {
        override fun run() {
            panelDraw.repaint()
        }
    }


}

class MyCircle(
    val circle: Ellipse2D,
    val color: Color,
    var stepX: Double,
    var stepY: Double
)

class PanelDraw3(private var myCircles: ArrayList<MyCircle> = ArrayList()) : JPanel()
{
    override fun paintComponent(g: Graphics) {
        super.paintComponent(g)
        val g2d = g as Graphics2D
        var curX: Double
        var curY: Double
        var curSize: Double

        for (myCircle in myCircles) {
            g2d.color = myCircle.color
            g2d.fill(myCircle.circle)
            curX = myCircle.circle.x + myCircle.stepX
            if (curX >= width || curX <= 0) {
                curX = myCircle.circle.x
                myCircle.stepX = -myCircle.stepX
            }
            curY = myCircle.circle.y + myCircle.stepY
            if (curY >= height || curY <= 0) {
                curY = myCircle.circle.y
                myCircle.stepY = -myCircle.stepY
            }
            curSize = myCircle.circle.width
            myCircle.circle.setFrame(curX, curY, curSize, curSize)
        }
    }

    fun drawCircle() {
        val ellipse2D: Ellipse2D = Ellipse2D.Double(100.0, 100.0, 80.0, 80.0)
        myCircles.add(MyCircle(ellipse2D, Color.BLUE, 0.0, 0.0))
        repaint()
    }

    fun drawCircles() {
        var x: Double
        var y: Double
        var size: Double
        var stepX: Double
        var stepY: Double
        var color: Color
        for (i in 0..4) {
            x = Math.random() * 400 + 50
            y = Math.random() * 300 + 50
            size = Math.random() * 40 + 10
            stepX = Math.random() * 10
            stepY = Math.random() * 10
            color = MyCollections.getRandomColor()
            val ellipse2D: Ellipse2D = Ellipse2D.Double(x, y, size, size)
            myCircles.add(MyCircle(ellipse2D, color, stepX, stepY))
        }
        repaint()
    }

}

fun main() {
    val frame = MyFrameGlobal3()
    frame.isVisible = true
}