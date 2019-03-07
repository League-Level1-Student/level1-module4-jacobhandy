import javax.swing.JFrame;
import javax.swing.JTextField;

public class calcLauncher {
  JTextField numone = new JTextField();
  JTextField numtwo = new JTextField();
  JFrame frame = new JFrame();
	public void createUI() {
	   numone = new JTextField();
		numtwo = new JTextField();
		frame = new JFrame();
		frame.add(numone);
		frame.add(numtwo);
   }
	
}
