import javax.swing.JFrame
import javax.swing.JButton
import java.awt.event.ActionListener

f = new JFrame()
b = new JButton("hello")
handler = {println "hello!"} as ActionListener

assert handler instanceof ActionListener

b.addActionListener handler
f.add b
f.show()

//クロージャから唯一のメソッドを持つインターフェイスへのas