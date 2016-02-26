package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		Robot x = new Robot();
			
			x.penDown(); 
		
		for (int i = 0; i < 6; i++) {
			
			x.move(100);
			x.turn(45);
			x.move(100);
		}
	
		
		
	}
}
