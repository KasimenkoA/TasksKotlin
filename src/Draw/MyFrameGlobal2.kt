package Draw

import MyMethods.MyCollections
import java.awt.*
import java.awt.geom.Ellipse2D
import java.awt.geom.Rectangle2D
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

        panelDraw = PanelDraw2(textField,buttonColor)

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
        button4.addActionListener{ panelDraw.canvasRepaint() }
        panelButton.add(button4)

        button5 = JButton("Button 5")
        button5.addActionListener{ panelDraw.squareBlink()}
        panelButton.add(button5)

        button6 = JButton("Button 6")
        button6.addActionListener{ panelDraw.squareToCircle()}
        panelButton.add(button6)

        button7 = JButton("Button 7")
        button7.addActionListener{ panelDraw.circleToOval() }
        panelButton.add(button7)

        button8 = JButton("Button 8")
        button8.addActionListener{ panelDraw.circleRandomMove() }
        panelButton.add(button8)

        add(panelButton, BorderLayout.NORTH)
        add(panelEdit, BorderLayout.CENTER)
        add(panelDraw, BorderLayout.SOUTH)
    }
}

class MyCanvas(var buttonColor: JButton) : Canvas() {
    val shapes: ArrayList<Shape> = ArrayList()

    init {
        buttonColor = buttonColor
    }



    override fun paint(g: Graphics) {
        val g2d = g as Graphics2D

        val color1 = Color.white
        val color2 = buttonColor.background

        if (color1 != color2) {
            val gradientPaint = GradientPaint(0f, 0f, color1, width.toFloat(), height.toFloat(), color2)
            g2d.paint = gradientPaint
            g2d.fillRect(0, 0, width, height)
        }

        g2d.color = Color.CYAN

        for (shape in shapes) {
            g2d.fill(shape)
        }
    }
}

private class PanelDraw2(private var textField: JTextField, buttonColor: JButton ) : JPanel()
{
    private val canvas: MyCanvas
    init {
        preferredSize = Dimension(600, 390)
        canvas = MyCanvas(buttonColor)
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

    fun canvasRepaint() {
        canvas.repaint()
    }

    fun squareBlink() {
        val thread = Thread {
            var ii = 100
            val centerX = 150
            val centerY = 150
            var curX: Int
            var curY: Int
            var direction = -1
            while (true) {
                curX = centerX - ii / 2
                curY = centerY - ii / 2
                canvas.shapes.add(Rectangle2D.Double(curX.toDouble(), curY.toDouble(), ii.toDouble(), ii.toDouble()))
                canvas.repaint()
                try {
                    Thread.sleep(10)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
                canvas.shapes.clear()
                ii += direction
                if (ii <= 1) direction = 1
                if (ii >= 100) direction = -1
            }
        }
        thread.start()
    }

    fun squareToCircle() {
        val thread = Thread {
            var ii = 100
            val centerX = 150
            val centerY = 150
            var curX: Int
            var curY: Int
            var direction = -1
            var isSquare = true
            while (true) {
                curX = centerX - ii / 2
                curY = centerY - ii / 2
                if (isSquare) {
                    canvas.shapes.add(
                        Rectangle2D.Double(
                            curX.toDouble(),
                            curY.toDouble(),
                            ii.toDouble(),
                            ii.toDouble()
                        )
                    )
                } else {
                    canvas.shapes.add(Ellipse2D.Double(curX.toDouble(), curY.toDouble(), ii.toDouble(), ii.toDouble()))
                }
                canvas.repaint()
                try {
                    Thread.sleep(10)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
                canvas.shapes.clear()
                ii += direction
                if (ii <= 1) {
                    direction = 1
                    isSquare = !isSquare
                }
                if (ii >= 100) {
                    direction = -1
                }
            }
        }
        thread.start()
    }

    fun circleToOval() {
        val thread = Thread {
            var startW = 100
            var startH = 100
            for (i in 100..199) {
                startW = i
                val ellipse2D: Ellipse2D = Ellipse2D.Double(100.0, 100.0, startW.toDouble(), startH.toDouble())
                canvas.shapes.add(ellipse2D)
                canvas.repaint()
                try {
                    Thread.sleep(20)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
                canvas.shapes.clear()
            }
            for (i in 100..199) {
                startH = i
                val ellipse2D: Ellipse2D = Ellipse2D.Double(100.0, 100.0, startW.toDouble(), startH.toDouble())
                canvas.shapes.add(ellipse2D)
                canvas.repaint()
                try {
                    Thread.sleep(20)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
                canvas.shapes.clear()
            }
        }
        thread.start()
    }

    fun circleRandomMove() {
        val thread = Thread {
            val startX = 200
            val startY = 200
            val size = 100
            val stepCount = 100
            val stepX = (Math.random() * width - startX) / stepCount
            val stepY = (Math.random() * height - startY) / stepCount
            var positionX = startX.toDouble()
            var positionY = startY.toDouble()
            canvas.shapes.clear()
            for (i in 0 until stepCount) {
                val ellipse2D: Ellipse2D = Ellipse2D.Double(positionX, positionY, size.toDouble(), size.toDouble())
                canvas.shapes.add(ellipse2D)
                canvas.repaint()
                try {
                    Thread.sleep(20)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
                canvas.shapes.clear()
                positionX += stepX
                positionY += stepY
            }
        }
        thread.start()
    }


}

fun main() {
    val frame = MyFrameGlobal2()
    frame.isVisible = true
}