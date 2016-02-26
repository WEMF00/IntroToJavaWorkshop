package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
			Robot hal = new Robot();
	
	void go() {

		// 6. Make the robot go as fast as possible
				hal.setSpeed(10);
				hal.setPenWidth(20);
		// 4. make a variable to hold the length of the triangle and set it to 50
				int triL = 50;
		// 7. Do the following (up to step 10) 60 times
				for (int i = 0; i < 600; i++) {
					
				
			// 9. Change the color of the pen to a random color
					hal.setRandomPenColor();
			// 8. Increase the length of the side by 10 pixels
					triL = triL + 10;
			// 5. call your drawTriangle() method using your length variable
					drawTriangle(triL);
			// 10. Turn the tortoise 6 degrees to the right
					hal.turn(6);
					
			}
	}

	/* 2. fill in the method below to draw a triangle. Use the length variable for the size of the triangle. */
	private void drawTriangle(int triL) {
		for (int i = 0; i < 3; i++) {
				hal.penDown();
				hal.move(triL);
				hal.turn(120);
		}
		
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
