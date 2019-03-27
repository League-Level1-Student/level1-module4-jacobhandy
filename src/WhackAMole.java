import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements MouseListener {
JFrame frame;
JPanel panel;
Dimension d = new Dimension(100,25);
	void drawButtons(Random r) {
		for(int a = 0; a<24; a++) {
			JButton b = new JButton();
			b.setPreferredSize(d);
			b.addMouseListener(this);
			panel.add(b);
		}
	}
	void createUI() {
	frame = new JFrame();
	panel = new JPanel();
	frame.setVisible(true);
	
	frame.add(panel);
	frame.setSize(275, 500);
}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
