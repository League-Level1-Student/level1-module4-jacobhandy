import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public  void CreateUI() {
     Random ran = new Random();
     int random = ran.nextInt(0-8);
     System.out.println(random);
     JOptionPane.showInputDialog("Enter your question ");
     if(random == 0) {
    	 JOptionPane.showMessageDialog(null, "Yes");
     }
     if(random == 1) {
    	 JOptionPane.showMessageDialog(null, "No");
     }
     if(random == 2) {
    	 JOptionPane.showMessageDialog(null, "Maybe you should ask Google");
     }
     if(random == 3) {
    	 JOptionPane.showMessageDialog(null, "I don't have time to answer your question.");
     }
     if(random == 4) {
    	 JOptionPane.showMessageDialog(null, "Go climb Mount Everest, then I will answer.");
     }
     if(random == 5) {
    	 JOptionPane.showMessageDialog(null, "Yes");
     }
     if(random == 6) {
    	 JOptionPane.showMessageDialog(null, "No");
     }
     if(random == 7) {
    	 JOptionPane.showMessageDialog(null, "Ur mom gay");
     }
     if(random == 8) {
    	 JOptionPane.showMessageDialog(null, "I don't know.                         or do I?");
     }
}
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	// 3. Print out this variable

	// 4. Get the user to enter a question for the 8 ball

	// 5. If the random number is 0

	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer

}
