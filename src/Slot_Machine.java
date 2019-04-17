import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Slot_Machine implements MouseListener, Runnable{
JFrame frame;
JButton spin;
JLabel slot1;
JLabel slot2;
JLabel slot3;
JLabel feedback;
JPanel output;
JPanel button;
String cherry = "pacman.png";
String seven = "7.png";
String bell = "3dworld.png";
JPanel slots;

@Override
public void run() {
	// TODO Auto-generated method stub
	frame = new JFrame();
	spin = new JButton();
	slot1 = new JLabel();
	slot2 = new JLabel();
	slot3 = new JLabel();
	feedback = new JLabel();
    output = new JPanel();
    button = new JPanel();
    slots = new JPanel();
    frame.setTitle("Money Disposal");
    frame.setSize(800,400);
    frame.add(output, BorderLayout.NORTH);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    feedback.setText("Click the spin button to waste your money!");
    output.add(feedback);
	frame.setVisible(true);
	spin.setText("SPIN!!!!!");
	spin.addMouseListener(this);
	button.add(spin);
	frame.add(button, BorderLayout.SOUTH);
    slots.add(slot1);
    slots.add(slot2);
    slots.add(slot3);
	frame.add(slots, BorderLayout.CENTER);
	
}
private void spinReels() {
	slots.removeAll();
	////call spinReel for each reel
	//revalidate the reels panel
	//check for win
}

private int spinReel() {
   return 0;
   //get random value 0 - 2
   //load image label based on random number
   //add label to reels panel
   //return the random number
	
}





@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	 if(e.getSource() == spin) {
		 System.out.println("nerf ganondorf");
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






public static void main(String[] args) {
	SwingUtilities.invokeLater(new Slot_Machine());
}






}
