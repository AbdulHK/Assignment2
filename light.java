import lejos.nxt.*;
import lejos.robotics.subsumption.*;
import lejos.robotics.navigation.DifferentialPilot;

public class light implements Behavior {
	private int value;
	private LightSensor light = new LightSensor(SensorPort.S3);
	private DifferentialPilot pilot = new DifferentialPilot(2.25, 4.25, Motor.A, Motor.C);
	private boolean suppress = false;
	int currfloor;

	
	public floor(int light)
	{
		value=light;
	}

	
	public void action(){
		

		suppress = true;
	}

	public void suppress (){

		suppress = true;
	}

	public boolean takeControl(){

		LCD.drawString("light", 50, 50);
		LCD.drawString("light " + Integer.toString(value), 0, 0);
	

		if (suppress == true)
			return false;

		try{Thread.sleep(200);}catch(Exception e)
		 {

		}
		currfloor = light.getNormalizedLightValue();
		if (suppress == false && currfloor >= value)
					Sound.beep()

			return true;
		else
			return false;
	}
}

