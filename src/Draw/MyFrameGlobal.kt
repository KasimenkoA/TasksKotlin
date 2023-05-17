package Draw

import MyMethods.MyCollections
import java.awt.*
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JPanel

class MyFrameGlobal(): JFrame()
{
    companion object{
        var curX:Int = 0
        var curY:Int = 0
    }

    init {
        setSize(600, 500)
        setLocationRelativeTo(null)
        title = "My global frame"
        defaultCloseOperation = EXIT_ON_CLOSE

        val panelButton = JPanel()
        panelButton.layout = GridLayout(2,4)

        val panelDraw = PanelDraw()
        panelDraw.preferredSize = Dimension(600, 400)

        val button1 = JButton("Button 1")
        button1.addActionListener { panelDraw.drawMyOval() }
        panelButton.add(button1)

        val button2 = JButton("Button 2")
        //button2.addActionListener { panelDraw.drawClear()}
        button2.addActionListener {panelDraw.moveOval()}
        panelButton.add(button2)

        val button3 = JButton("Button 3")
        button3.addActionListener { panelDraw.rotateRectangle() }
        panelButton.add(button3)

        val button4 = JButton("Button 4")
        button4.addActionListener { panelDraw.changeColor() }
        panelButton.add(button4)

        val button5 = JButton("Button 5")
        button5.addActionListener { panelDraw.drawArcCircle() }
        panelButton.add(button5)

        val button6 = JButton("Button 6")
        button6.addActionListener { panelDraw.CircleToPoint() }
        panelButton.add(button6)

        val button7 = JButton("Button 7")
        button7.addActionListener { panelDraw.squareMoving() }
        panelButton.add(button7)

        val button8 = JButton("Button 8")
        panelButton.add(button8)

        add(panelButton, BorderLayout.NORTH)
        add(panelDraw, BorderLayout.SOUTH)
    }

}

fun main() {

    val frame = MyFrameGlobal()
    frame.isVisible = true

}

class PanelDraw: JPanel()
{
    public fun drawMyOval()
    {
        val g = graphics
        g.color = Color.blue
        g.fillOval(200, 150, 90, 80)
    }

    public fun drawClear()
    {
        removeAll()
        repaint()
    }

    public fun moveOval()
    {
        val g = graphics
        g.color = Color.green

        MyFrameGlobal.curX = 0
        MyFrameGlobal.curY = 0

        while (true) {
            g.clearRect(0, 0, width, height)
            g.fillOval(MyFrameGlobal.curX, MyFrameGlobal.curY, 90, 80)

            try {
                Thread.sleep(10)
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
            MyFrameGlobal.curX++
            MyFrameGlobal.curY++
            if (MyFrameGlobal.curX >= width || MyFrameGlobal.curY >= height) {
                break
            }
        }
    }

    public fun rotateRectangle()
    {
        val g = graphics
        val g2d = g as Graphics2D
        g2d.color = Color.CYAN
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON)


        val rSize = 80

        var angle = 0
        val angleStep = 1
        var count = 0

        while (count < 3) {
            g2d.clearRect(0, 0, width, height)
            g2d.rotate(Math.toRadians(angleStep.toDouble()), (width / 2).toDouble(), (height / 2).toDouble())
            g2d.fillRect(width / 2 - rSize / 2, height / 2 - rSize / 2, rSize, rSize)
            try {
                Thread.sleep(10)
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
            angle += angleStep
            if (angle > 360) {
                angle = angleStep
                count++
            }
        }
        g2d.clearRect(0, 0, width, height)
    }

    public fun changeColor()
    {
        Thread {
            var curColor = MyCollections.getRandomColor()
            for (i in 0..99) {
                background = curColor
                try {
                    Thread.sleep(100)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
                curColor = MyCollections.getNextRandomColor(curColor!!)
            }
        }.start()
    }

    fun drawArcCircle() {
        val g = graphics
        g.color = Color.red
        g.fillArc(50, 50, 300, 300, 0, 90)
        g.color = Color.green
        g.fillArc(50, 50, 300, 300, 90, 90)
        g.color = Color.blue
        g.fillArc(50, 50, 300, 300, 180, 90)
        g.color = Color.yellow
        g.fillArc(50, 50, 300, 300, 270, 90)
    }

    fun CircleToPoint() {
        Thread {
            var size = 100
            val g = graphics
            g.color = Color.green
            for (i in 0..99) {
                g.fillOval(100, 100, size, size)
                try {
                    Thread.sleep(100)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
                g.clearRect(100, 100, 100, 100)
                size--
            }
        }.start()
    }

    fun squareMoving() {
        val g = graphics
        g.color = Color.magenta
        var xx = 100
        var yy = 100
        var dx = 0
        var dy = 0
        var direction = 0
        while (direction < 4) {
            when (direction) {
                0 -> {
                    dx = 1
                    dy = 0
                }
                1 -> {
                    dx = 0
                    dy = 1
                }
                2 -> {
                    dx = -1
                    dy = 0
                }
                3 -> {
                    dx = 0
                    dy = -1
                }
            }
            for (i in 0..99) {
                g.fillRect(xx, yy, 50, 50)
                try {
                    Thread.sleep(50)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
                g.clearRect(xx, yy, 50, 50)
                xx += dx
                yy += dy
            }
            direction++
        }
    }


}