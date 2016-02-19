package day3;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String x = JOptionPane.showInputDialog("What is your name?");
		String y = JOptionPane.showInputDialog("What is your Quest?");
		String z = JOptionPane.showInputDialog("What is your favorite colour?");
			JOptionPane.showMessageDialog(null, "Hello, " + x);
			JOptionPane.showMessageDialog(null, "You seek to " + y.toLowerCase());
			JOptionPane.showMessageDialog(null, "You enjoy the colour " + z.toLowerCase());
	}
}
