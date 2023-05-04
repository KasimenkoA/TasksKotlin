package Draw

import java.awt.Graphics
import javax.swing.JFrame
import javax.swing.JPanel

class MyFrame : JFrame() {
    init {
        setSize(600, 400)
        setLocationRelativeTo(null)
        title = "My frame"
        defaultCloseOperation = EXIT_ON_CLOSE
    }
}

class MyPanel : JPanel() {
    override fun paintComponent(g: Graphics) {
        super.paintComponent(g)

        //g.drawOval(100,150,60,60)

//        g.drawLine(100, 300, 200, 100)
//        g.drawLine(200, 100, 300, 300)
//        g.drawLine(300, 300, 100, 150)
//        g.drawLine(100, 150, 300, 150)
//        g.drawLine(300, 150, 100, 300)

        //g.drawOval( 100,100,80,80 );

//                g.drawLine( 100,300,200,100 );
//                g.drawLine( 200,100,300,300 );
//                g.drawLine( 300,300,100,150 );
//                g.drawLine( 100,150,300,150 );
//                g.drawLine( 300,150,100,300 );
        var y = 50
        while (y < 250) {
            var x = 50
            while (x < 400) {
                g.drawRect(x, y, 150, 100)
                x += 150
            }

            y += 100
        }

    }
}

fun main() {
    val myFrame = MyFrame2()

    val myPanel = MyPanel()
    myFrame.add(myPanel)

    myFrame.isVisible = true


}