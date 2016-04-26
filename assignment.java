import lejos.robotics.subsumption.*;
import lejos.nxt.*;
import lejos.robotics.navigation.DifferentialPilot;
/* 
Mobile Robotics
Assignment 2  
Maciej Piotrowski C13470112
Abdulellah Hakim D12122837
*/
public class assignment
{
	
	public static void main(String[] args)
	{	
		//Main class will get called whenever the program starts.
		LCD.drawString("Assignment 2", 0 ,0);
		Button.waitForAnyPress();
		LCD.clear();
		
		Measure measure = new Measure(); //calling measure room
		Behavior motor = new motor();//motor behaviour takes length and width from Measure() class.
		Behavior see = new seewalls(measure.lenght, measure.width);
		Behavior light = new light(measure.floorlight);   //light takes the light value from Measure() class.
		Behavior object = new object(); //creating a behaviour to avoid objects.
		Behavior touch = new hitwall(); // hit the wall detection
	
		Behavior [] b1 = {motor,touch,see,object,light};			//adding behaviours into arbitrator array and start it.

		Arbitrator arby = new Arbitrator(b1);
		arby.start();
		
		System.exit(0);
	}
}