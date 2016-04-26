import lejos.nxt.*;
import lejos.robotics.subsumption.*;
import lejos.robotics.navigation.DifferentialPilot;

public class hitwall implements Behavior {
	private DifferentialPilot pilot = new DifferentialPilot(2.25, 4.25, Motor.A, Motor.B);
	private boolean suppress = false;
	private TouchSensor touch = new TouchSensor(SensorPort.S1);
	
	public void action()
	{	 //what happens when the behaviour is activated.
		suppress = false;   //when to stop the action method.
		LCD.clear();
		LCD.drawString("hit wall",0, 0);
		pilot.stop();
		Button.waitForAnyPress();
		System.exit(0);	
	}

	public void suppress ()
	{
		suppress = true;
	}

	public boolean takeControl()
	{
		if(touch.isPressed())
		{
			return true;
		}
		else
		{
			return false;
		}	
	}
}

