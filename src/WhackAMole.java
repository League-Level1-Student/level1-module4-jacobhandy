import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sun.swing.internal.plaf.basic.resources.basic;

public class WhackAMole implements MouseListener {
JFrame frame;
JPanel panel;
Dimension d = new Dimension(100,25);
	JButton b;
	int score = 0;
	
	JLabel points;
public void drawButtons() {
	Random r = new Random();
	int z = r.nextInt(24);
	for(int a = 0; a<24; a++) {
			b = new JButton();
			b.setPreferredSize(d);
			b.addMouseListener(this);
			b.setSize(d);
			if(z == a) {
				b.setText("Jacob");
			}
			panel.add(b);
		}
	}
	void createUI() {

	frame = new JFrame();
	panel = new JPanel();
	frame.setVisible(true);
	points = new JLabel();
	 
	frame.add(panel);
	frame.setSize(275, 500);
	
	
	
	

}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton)e.getSource();
		 
			if(b.getText().equals("Jacob")) {
			  System.out.println("Yeet");
			  panel.removeAll();
			  drawButtons();
			  panel.revalidate();
			   
			  
		 }
		 else {
			 System.out.println("Normie Alert");
			 drawButtons();
		 }
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
