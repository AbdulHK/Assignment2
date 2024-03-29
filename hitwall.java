import lejos.nxt.*;
import lejos.robotics.subsumption.*;
import lejos.robotics.navigation.DifferentialPilot;
/* 
Mobile Robotics
Assignment 2  
Maciej Piotrowski C13470112
Abdulellah Hakim D12122837
*/
public class hitwall implements Behavior 
{
	private DifferentialPilot pilot = new DifferentialPilot(2.25, 4.25, Motor.A, Motor.B);
	private boolean suppress = false;
	private TouchSensor touch = new TouchSensor(SensorPort.S1);
	
	public void action()
	{	 //what happens when the behaviour is activated.
		suppress = false;   //when to stop the action method.
		LCD.clear();
		LCD.drawString("hit wall",0, 0); // printing hitwall on the screen
		pilot.stop(); // robot stops moving
		Button.waitForAnyPress(); // waiting for button being pressed 
		System.exit(0);	// program exit
	}

	public void suppress ()
	{
		suppress = true;
	}

	public boolean takeControl()
	{
		if(touch.isPressed())// checking if touch sensor is pressed
		{
			return true;
		}
		else
		{
			return false;
		}	
	}
}

