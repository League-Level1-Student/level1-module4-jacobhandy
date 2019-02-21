import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
JFrame frame;
JLabel letter;
String a;

char currentLetter;
public void createUI() {
	frame = new JFrame();
	frame.addKeyListener(this);
	letter = new JLabel();
	frame.add(letter);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	currentLetter = generateRandomLetter();
	letter.setFont(letter.getFont().deriveFont(100.0f));
	letter.setHorizontalAlignment(JLabel.CENTER);

	a = Character.toString(currentLetter);
	letter.setText(a);
	frame.pack();
}
char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	char input = e.getKeyChar();
	//System.out.println("Normie, you typed " + input);
	if(input == currentLetter) {
		
		
		frame.getContentPane().setBackground(Color.GREEN);
	}
    if(input != currentLetter) {
    	frame.getContentPane().setBackground(Color.RED);
    }
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
    currentLetter = generateRandomLetter();
    a = Character.toString(currentLetter);
    letter.setText(a);
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}
