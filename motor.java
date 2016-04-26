import lejos.robotics.subsumption.*;
import lejos.nxt.*;
import lejos.robotics.navigation.DifferentialPilot;
/* 
Mobile Robotics
Assignment 2  
Maciej Piotrowski C13470112
Abdulellah Hakim D12122837
*/
public class motor implements Behavior{

	private DifferentialPilot pilot = new DifferentialPilot(2.25, 4.25, Motor.A, Motor.B);
	private boolean suppress = false;

	public void action()
	{
			suppress = false;
			pilot.reset();
			pilot.setTravelSpeed(7.0);// keeps the robot going forward
			pilot.forward();
    }
	
	public void suppress(){
		suppress = true;
	}

	public boolean takeControl()
	{
			return true;
	
	}
	
}
