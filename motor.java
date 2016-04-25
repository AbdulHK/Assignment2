import lejos.robotics.subsumption.*;
import lejos.nxt.*;
import lejos.robotics.navigation.DifferentialPilot;


public class motor implements Behavior{

	private DifferentialPilot pilot = new DifferentialPilot(2.25, 4.25, Motor.A, Motor.C);
	private boolean suppress = false;
	public float length1;
	public float width1;

	

	public motor(float length,float width)
	{
		LCD.drawString("length"+Float.toString(length),0, 0);
		LCD.drawString("width"+Float.toString(width),0, 5);

		length1 = length;
		width1 = width;
	}
	public void action(){
		suppress = false;
		//moves the robot forward
		pilot.setTravelSpeed(4.0);
		pilot.forward();
	}
	
	public void suppress(){
		suppress = true;
	}

	public boolean takeControl(){
		return true;
	}
	
	
}
