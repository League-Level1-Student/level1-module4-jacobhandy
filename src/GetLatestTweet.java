import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GetLatestTweet implements ActionListener {
JFrame frame;
JPanel panel;
JTextField TF;
JButton search;
	public void createUI() {
	frame = new JFrame();
	panel = new JPanel();
	TF = new JTextField("", 20);
	search = new JButton();
	frame.add(panel);
	panel.add(TF);
	search.setText("Search the Twitterverse and lose your life to social media...");
	search.addActionListener(this);
	panel.add(search);
	frame.pack();
	frame.setVisible(true);
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(search)) {
			System.out.println("big chungus");
		}
	}
}
