package day3;

import javax.swing.JOptionPane;

public class Snooper {
	public static void main(String[] args) {
		String x = JOptionPane.showInputDialog("What is your name?");
		String y = JOptionPane.showInputDialog("What is your favorite colour?");
		String z = JOptionPane.showInputDialog("Where were you born?");
			JOptionPane.showMessageDialog(null, "You are " + x + ", born in " + z + ". You like the colour " + y.toLowerCase() + ".");
			
			
	}
}
