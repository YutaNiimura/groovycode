import javax.swing.*;

def frame = new JFrame()
JButton button = new JButton("Say hello")
button.actionPerformed = {event -> println 'hello!'}
frame.add button
frame.visible = true