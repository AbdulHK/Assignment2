import lejos.nxt.*;
import lejos.robotics.subsumption.*;
import lejos.robotics.navigation.DifferentialPilot;

public class light implements Behavior {
	private int floorcolour;
	private LightSensor light = new LightSensor(SensorPort.S3);
	private DifferentialPilot pilot = new DifferentialPilot(2.25, 4.25, Motor.A, Motor.C);
	private boolean suppress = false;
	int currfloor;

	
	public light(int floorlight)
	{
		floorcolour = floorlight;
	}

	
	public void action()
	{
		//LCD.drawString("Surface", 5, 0, 0);
		Sound.beep();
		suppress = false;
	}

	public void suppress ()
	{
		suppress = true;
	}

	public boolean takeControl()
	{
		if(floorcolour > light.getLightValue() || floorcolour <light.getLightValue())
			return true;
	}
}

