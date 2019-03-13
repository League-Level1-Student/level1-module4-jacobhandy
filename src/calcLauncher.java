import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calcLauncher implements ActionListener {
  JTextField numone = new JTextField();
  JTextField numtwo = new JTextField();
  JFrame frame = new JFrame();
  JPanel panel;
  Calculator calc;
  JButton add;
  JButton subtract;
  JButton multiply;
  JButton divide;
  JLabel answer;
  public void createUI() {
	    numone = new JTextField("", 20);
		numtwo = new JTextField("", 20);
		 
		frame = new JFrame();
		calc = new Calculator();
	    panel = new JPanel();
        frame.setVisible(true);
        frame.add(panel);
	    panel.add(numone);
		panel.add(numtwo);
		add = new JButton();
		subtract = new JButton();
		multiply = new JButton();
		divide = new JButton();
		add.addActionListener(this);
		subtract.addActionListener(this);
		multiply.addActionListener(this);
		divide.addActionListener(this);
		answer = new JLabel();
		add.setText("Add");
		subtract.setText("Subtract");
		multiply.setText("Multiply");
		divide.setText("Divide");
		panel.add(add);
		panel.add(subtract);
		panel.add(multiply);
		panel.add(divide);
		panel.add(answer);
		frame.pack();
		numone.setMinimumSize(new Dimension (100,150));
   }
  
  
  
  @Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	if(e.getSource().equals(add)) {
		String inputOne = numone.getText();
		int x = Integer.parseInt(inputOne);
		String inputTwo = numtwo.getText();
		int y = Integer.parseInt(inputTwo);
		calc.Add(x,y);
		int sol = (int) calc.Add(x, y);
		String sum = Integer.toString(sol);
		answer.setText(sum);
	}
   if(e.getSource().equals(subtract)) {
	   String inputOne = numone.getText();
		int x = Integer.parseInt(inputOne);
		String inputTwo = numtwo.getText();
		int y = Integer.parseInt(inputTwo);
	   calc.Subtract(x, y);
	   int sol = (int) calc.Subtract(x, y);
	   String diff = Integer.toString(sol);
	   answer.setText(diff);
   }
  if(e.getSource().equals(multiply)) {
	  String inputOne = numone.getText();
		int x = Integer.parseInt(inputOne);
		String inputTwo = numtwo.getText();
		int y = Integer.parseInt(inputTwo);
		int sol = (int) calc.Multiply(x, y);
		String product = Integer.toString(sol);
		answer.setText(product);
  }
  if(e.getSource().equals(divide)){
	  String inputOne = numone.getText();
		int x = Integer.parseInt(inputOne);
		String inputTwo = numtwo.getText();
		int y = Integer.parseInt(inputTwo);
		int sol = (int) calc.Divide(x, y);
		String quotient = Integer.toString(sol);
		answer.setText(quotient);
	    
  }
  }
	
}
