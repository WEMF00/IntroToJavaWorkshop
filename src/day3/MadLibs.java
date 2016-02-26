package day3;

import javax.swing.JOptionPane;

public class MadLibs {
	public static void main(String[] args) {
		
		String mes1 = JOptionPane.showInputDialog("Noun:");
		String mes2 = JOptionPane.showInputDialog("Adjective:");
		String mes3 = JOptionPane.showInputDialog("Noun:");
		String mes4 = JOptionPane.showInputDialog("Adjective:");
		
			JOptionPane.showMessageDialog(null, "There once was a " + mes1 + " who rode into town on his " + mes2.toLowerCase() + " " + mes3 + ". The entire situation was very " + mes4.toLowerCase() + ".");
	}
}
