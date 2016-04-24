import lejos.nxt.*;
import lejos.robotics.subsumption.*;
import lejos.robotics.navigation.DifferentialPilot;

public class light implements Behavior {
	private int floorcolour;
	private LightSensor light = new LightSensor(SensorPort.S3);
	private DifferentialPilot pilot = new DifferentialPilot(2.25, 4.25, Motor.A, Motor.C);
	private boolean suppress = false;
	float currfloor;

	
	public light(int floorlight)
	{ //getting light value from measure class.
		LCD.drawString("light"+Integer.toString(floorlight),0, 0);
		
		floorcolour = floorlight;
	}

	
	public void action()
	{	 //what happens when the behaviour is activated.
		LCD.clear();
		
		LCD.drawString("Surface",0, 0);
		Sound.beep();
		
		
		suppress = false;
		
	}

	public void suppress ()
	{
		suppress = true;
	}

	public boolean takeControl()
	{
		 //condtion when to actviate the behaviour
		currfloor=light.getLightValue();
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

