package Draw

import java.awt.BorderLayout
import java.awt.Dimension
import java.awt.GridLayout
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JPanel

class MyFrameGlobal3 : JFrame() {
    var panelDraw: PanelDraw3
    var button1: JButton
    var button2: JButton
    var button3: JButton
    var button4: JButton
    var button5: JButton
    var button6: JButton
    var button7: JButton
    var button8: JButton

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
        panelButton.add(button1)
        button2 = JButton("Button 2")
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
    }
}


class PanelDraw3 : JPanel() {

}


fun main() {
    val frame = MyFrameGlobal3()
    frame.isVisible = true
}