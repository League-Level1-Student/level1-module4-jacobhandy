import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.*;
public class chuckleClicker implements Runnable, MouseListener {
 JFrame frame;
 JPanel panel;
 JButton joke;
 JButton punchline;
	public  void makeButtons()  {
	 frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 panel = new JPanel();
	frame.setTitle("Chuckle Clicker");
	frame.add(panel);
	 joke = new JButton();
	joke.setText("JOKE");
	joke.addMouseListener(this);
	panel.add(joke);
	punchline = new JButton();
	punchline.setText("PUNCHLINE");
	punchline.addMouseListener(this);
	panel.add(punchline);
    frame.setVisible(true);
	frame.pack();
}


public void mouseClicked(MouseEvent e) {
    if(e.getSource().equals(joke)) {
    	JOptionPane.showMessageDialog(null, "Click the punchline button to hear a joke");
    	
    }
   if(e.getSource().equals(punchline)) {
	   JOptionPane.showMessageDialog(null, "Crime in multi-storey car parks. That is wrong on so many different levels - Tim Vine");
   }
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void run() {
	// TODO Auto-generated method stub
	
}
}