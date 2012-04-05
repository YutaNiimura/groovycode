import javax.swing.*
import java.awt.event.*

f = new JFrame()
lab = new JTextField("hello")
handler = [
	keyTyped:{KeyEvent key -> println key}
	] as KeyAdapter		//mapをkeyadapterに

assert handler instanceof KeyAdapter

lab.addKeyListener(handler)

f.add(lab)
f.show()

//マップをオブジェクトのように扱う