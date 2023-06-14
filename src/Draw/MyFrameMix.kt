package Draw

import java.awt.BorderLayout
import java.awt.Color
import java.awt.Dimension
import java.awt.GridLayout
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JPanel

class MyFrameMix : JFrame() {
    var panelDraw: PanelDrawMix
    var button1: JButton

    init {
        title = "My frame Mix"
        setSize(600, 500)
        setLocationRelativeTo(null)
        defaultCloseOperation = EXIT_ON_CLOSE

        val panelButton = JPanel()
        panelButton.layout = GridLayout(2, 4)

        panelDraw = PanelDrawMix()
        panelDraw.preferredSize = Dimension(600, 400)

        button1 = JButton("Button 1")
        button1.addActionListener { panelDraw.fillBackground() }
        panelButton.add(button1)

        add(panelButton, BorderLayout.NORTH)
        add(panelDraw, BorderLayout.SOUTH)
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