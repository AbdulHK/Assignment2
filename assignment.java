import lejos.robotics.subsumption.*;
import lejos.nxt.*;

public class assignment{
	public static void main(Stringp[] args){
		LCD.drawString("Assignment 2", 0, 0);
		Button.waitForAnyPress();
		LCD.clear();
		Measure measure = new measure;

		
		
		
		Behavior light = new light(measure.light);
		
		Behavior [] b1 = {light};

		Arbitrator arby = new Arbitrator(b1);
		arby.start();
		
		System.exit(0);
	}
}