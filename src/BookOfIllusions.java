
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2018
 *    Level 1
 */

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
 
/** We’re going to make a slideshow of cool optical illusions. When the user clicks on an illusion, a new one will be loaded. **/

public class BookOfIllusions extends MouseAdapter {

	/*
	 * Here we are instantiating our BookOfIllusions class and calling it’s createBook() method. This is because we want to get out of the
	 * static main method, so that we can add a click listener to each illusion.
	 */

	public static void main(String[] args) throws Exception {
		BookOfIllusions illusions = new BookOfIllusions();
		illusions.createBook();
	}

	// 1. Make a JFrame variable and initialize it using "new JFrame()"
   JFrame frame;
   JLabel cat;
   JLabel duck;
   String image2;
   private void createBook() {
		frame = new JFrame();
		// 2. make the frame visible
		frame.setVisible(true);
		// 3. set the size of the frame
		frame.setSize(1000,1000);
		// 4. find 2 images and save them to your project’s default package
		
		// 5. make a variable to hold the location of your image. e.g. "illusion.jpg"
		String image1 = "catillusion.jpg";
		 image2 = "researchonop.jpg";
		// 6. create a variable of type "JLabel" but don’t initialize it yet
		
		// 7. use the "loadImage..." methods below to initialize your JLabel
		cat = loadImageFromComputer(image1);
		// 8. add your JLabel to the frame
		frame.add(cat);
		// 9. call the pack() method on the frame
	frame.pack();
		// 10. add a mouse listener to your frame (hint: use *this*)
	frame.addMouseListener(this);
	}

	public void mousePressed(MouseEvent e) {
		// 11. Print "clicked!" to the console when the mouse is pressed
		System.out.println("clicked");
		// 12. remove everything from the frame that was added earlier
		frame.remove(cat);
		// 13. load a new image like before (this is more than one line of code)
		duck = loadImageFromComputer(image2);
		frame.add(duck);
		// 14. pack the frame
		frame.pack();
		  
		
			JOptionPane.showMessageDialog(null, "Go to adfly.com to get some viruses on your computer!");
		
	    	JOptionPane.showMessageDialog(null, "Vote against Trump in 2020!");
	   
	    	JOptionPane.showMessageDialog(null, "Vote to make America Communist!");
	  
	    	JOptionPane.showMessageDialog(null, "John Wick is in tilted towers and he needs YOUR help to get him a gold scar so he can surrvive! All he needs is your mom's credit card number!");
	   
	}

	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups
                                                                                                                                         
	/*
	 * To use this method, the image must be placed in your Eclipse project under "default package".
	 */
	public  JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

}


