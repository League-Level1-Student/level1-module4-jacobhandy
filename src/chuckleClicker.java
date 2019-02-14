import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class chuckleClicker {
 void makeButtons() {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	frame.add(panel);
	JButton joke = new JButton();
	joke.setText("JOKE");
	joke.addMouseListener((MouseListener) this);
	panel.add(joke);
	JButton punchline = new JButton();
	punchline.setText("PUNCHLINE");
	panel.add(punchline);
	frame.pack();
}
public void main(String[] args) {
	makeButtons();
	
}
}
