import lejos.nxt.*;
import lejos.robotics.subsumption.*;
import lejos.robotics.navigation.DifferentialPilot;
/* 
Mobile Robotics
Assignment 2  
Maciej Piotrowski C13470112
Abdulellah Hakim D12122837
*/
public class light implements Behavior {
	int floorcolour;   //floor value from measure class
	private LightSensor light = new LightSensor(SensorPort.S3);
	private DifferentialPilot pilot = new DifferentialPilot(2.25, 4.25, Motor.A, Motor.B);
	private boolean suppress = false;
	int currfloor;    //current floor color "where the robot is standing"

	
	public light(int floorlight)
	{ //getting light value from measure class on the constructor and assigning it to a value here for easier access.
		LCD.drawString("light"+Integer.toString(floorlight),0, 0);
		
		floorcolour = floorlight;
	}

	public void action()
	{	 //what happens when the behaviour is activated.
		suppress = false;   //when to stop the action method.
		LCD.clear();
		LCD.drawString("Surface",0, 0);
		LCD.drawString(Float.toString(floorcolour),4,0);
		Sound.beep();
		try{
			Thread.sleep(100);
		}
		catch(Exception e)
		{
			
		}	
	}

	public void suppress ()
	{
		suppress = true;
	}

	public boolean takeControl()
	{
		 //condtion when to actviate the behaviour
		currfloor=light.getLightValue();
		//comparing the current floor value to the one we have stored. if it is greater than OR less than it. robot would beep.
		if((floorcolour - 5 )> currfloor || (floorcolour + 5)  < currfloor)
		{
				return true;
		}
		else
		{
			return false;
		}		
	}
}

