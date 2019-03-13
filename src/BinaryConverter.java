import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BinaryConverter implements ActionListener {
	JFrame Frame = new JFrame();
	JPanel Panel = new JPanel();
	JTextField Field = new JTextField();
	JButton Button = new JButton();
	JLabel Label = new JLabel();
	
	 void createUI() {
		Frame.setVisible(true);
		
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.setTitle("What time is it? Converty time!");
		
		Frame.add(Panel);
		
		Field.setText("Click here to input your binary input");
		Button.setText("Converty");
		Label.setText("Your input will be ouputed here");
		Button.addActionListener(this);
		
		Panel.add(Field);
		Panel.add(Button);
		Panel.add(Label);
		
		
		Frame.pack();
	}

	public static void main(String[] args) {
		new BinaryConverter().createUI();
	}
	
	String convert(String input) {
        if(input.length() != 8){
             JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
             return "-";
        }
        String binary = "[0-1]+";    //must contain numbers in the given range
        if (!input.matches(binary)) {
             JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
             return "-";
        }
        try {
             int asciiValue = Integer.parseInt(input, 2);
             char theLetter = (char) asciiValue;
             return "" + theLetter;
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
             return "-";
        }
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		String txt = convert(Field.getText());
		
		Label.setText(txt);
		Frame.pack();
		
	}

}
