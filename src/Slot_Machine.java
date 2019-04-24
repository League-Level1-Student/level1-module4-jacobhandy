import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
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
String bell = "3dworld.jpg";
JPanel slots;
int reel1;
int reel2;
int reel3;
int balance = 50;
JLabel credit;
JPanel finance;
@Override
public void run() {
	// TODO Auto-generated method stub
	frame = new JFrame();
	spin = new JButton();
	finance = new JPanel();
	String money = Integer.toString(balance);
	credit = new JLabel();
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
	spin.setText("SPIN");
	spin.addMouseListener(this);
	button.add(spin);
	frame.add(button, BorderLayout.SOUTH);
    	frame.add(slots, BorderLayout.CENTER);
    	frame.add(finance, BorderLayout.WEST);
    	finance.add(credit);
    	credit.setText("Your balance is $" + money );
	
}
private void spinReels() {
	slots.removeAll();
	reel1 = spinReel();
	reel2 = spinReel();
	reel3 = spinReel();
	
	////call spinReel for each reel
	slots.revalidate();
	//revalidate the reels panel
	//check for win
	if(reel1 == reel2 && reel2 == reel3 && reel1 == reel3) {
		feedback.setText("You Win!");
	}
	else {
		feedback.setText("You suck!");
	}
}

private int spinReel() {
  Random r = new Random();
  int image = r.nextInt(3);
  if(image == 0) {
	  try {
	  slots.add(createLabelImage(cherry));
	  }
	  catch(MalformedURLException e) {
		  e.printStackTrace();
	  }
  }
  if(image == 1) {
	  
		  try {
	     slots.add(createLabelImage(seven));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
  }
  if(image == 2) {
	  try {
		slots.add(createLabelImage(bell));
	
	  } catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  return image;
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
		 spinReels();
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



private JLabel createLabelImage(String fileName) throws MalformedURLException{
    URL imageURL = getClass().getResource(fileName);
if (imageURL == null){
	System.err.println("Could not find image " + fileName);
	return new JLabel();
}
Icon icon = new ImageIcon(imageURL);
JLabel imageLabel = new JLabel(icon);
return imageLabel;
}



public static void main(String[] args) {
	SwingUtilities.invokeLater(new Slot_Machine());
}






}
