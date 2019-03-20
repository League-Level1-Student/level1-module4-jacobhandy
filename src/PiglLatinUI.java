import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PiglLatinUI implements MouseListener {
JFrame frame;
JPanel panel;
JTextField input;
JLabel output;
JButton translate;
PigLatinTranslator pigLatin;
public void CreateUI() {
	frame = new JFrame();
	panel = new JPanel();
	input = new JTextField("", 20);
	output = new JLabel();
	translate = new JButton();
	pigLatin = new PigLatinTranslator();
	translate.addMouseListener(this);
	translate.setText("Translate");
    frame.add(panel);
    panel.add(input);
    panel.add(output);
    panel.add(translate);

    frame.setVisible(true);
    frame.pack();
   
}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource().equals("translate")) {
		String result = pigLatin.translate(input.getText());
		output.setText(result);
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
}
