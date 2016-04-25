import lejos.nxt.*;
import lejos.robotics.subsumption.*;
import lejos.robotics.navigation.DifferentialPilot;

public class light implements Behavior {
	 int floorcolour;   //floor value from measure class
	private LightSensor light = new LightSensor(SensorPort.S3);
	private DifferentialPilot pilot = new DifferentialPilot(2.25, 4.25, Motor.A, Motor.C);
	private boolean suppress = false;
	int currfloor;    //current floor color "where the robot is standing"

	
	public light(int floorlight)
	{ //getting light value from measure class on the constructor and assigning it to a value here for easier access.
		LCD.drawString("light"+Integer.toString(floorlight),0, 0);
		
		floorcolour = floorlight;
	}

	
	public void action()
	{	 //what happens when the behaviour is activated.
		LCD.clear();
		
		LCD.drawString("Surface",0, 0);
		Sound.beep();
		
		suppress = false;   //when to stop the action method.
		
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
		if(currfloor > currfloor || currfloor < currfloor)
			{
		
				return true;
			}
		else
			{
			return false;
			}
		//LCD.drawString("light"+Integer.toString(floorlight),0, 0);
		
				
	}
}

