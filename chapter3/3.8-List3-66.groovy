import javax.swing.*
import java.awt.event.*

f = new JFrame()
lab = new JTextField("hello")
handler = [
	keyTyped:{KeyEvent key -> println key}
	] as KeyAdapter		//map��keyadapter��

assert handler instanceof KeyAdapter

lab.addKeyListener(handler)

f.add(lab)
f.show()

//�}�b�v���I�u�W�F�N�g�̂悤�Ɉ���