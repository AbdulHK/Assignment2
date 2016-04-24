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
		
		Measure measure = new Measure(); //calling measure room
		//robot behaviours.
		Behavior motor = new motor(measure.lenght,measure.width); 
		Behavior light = new light(measure.floorlight);
		Behavior object = new object();

		
		Behavior [] b1 = {motor,light};
		//add behaviours into arbitrator array and start it.
		Arbitrator arby = new Arbitrator(b1);
		arby.start();
		
		System.exit(0);
	}
}