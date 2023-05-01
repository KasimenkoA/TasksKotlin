package Draw

import javax.swing.JFrame

class MyFrame: JFrame()
{
    init{
        setSize(600,300)
        setLocationRelativeTo(null)
        title = "My frame"
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    }
}

fun main() {
    val myFrame = MyFrame()
    myFrame.isVisible = true
}