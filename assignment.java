import lejos.robotics.subsumption.*;
import lejos.nxt.*;
import lejos.robotics.navigation.DifferentialPilot;


public class assignment
{
	
	public static void main(String[] args)
	{
		LCD.drawString("Assignment 2", 0 ,0);
		Button.waitForAnyPress();
		LCD.clear();
		
		Measure measure = new Measure();
		Behavior motor = new motor();
		Behavior light = new light(measure.floorlight);
		
		Behavior [] b1 = {motor,light};
		
		Arbitrator arby = new Arbitrator(b1);
		arby.start();
		
		System.exit(0);
	}
}