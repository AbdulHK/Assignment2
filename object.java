import lejos.nxt.*;
import lejos.robotics.subsumption.*;
import lejos.robotics.navigation.DifferentialPilot;
/* 
Mobile Robotics
Assignment 2  
Maciej Piotrowski C13470112
Abdulellah Hakim D12122837
*/
public class object implements Behavior {

	//sonar sensor and differntial pilot.
	private UltrasonicSensor sonar = new UltrasonicSensor(SensorPort.S4);
	private DifferentialPilot pilot = new DifferentialPilot(2.25, 4.25, Motor.A, Motor.B);
	private boolean suppress = false;

	public void action()
	{	
		//travelling in a circual path tutorial.
		// http://www.lejos.org/nxt/nxj/tutorial/WheeledVehicles/SteerTest.java
		LCD.clear();
		//pilot steer will make the robot keep moving staright while rotating the wheels with an angle.
		LCD.drawString("avoiding object",0, 0);
		pilot.setTravelSpeed(4.0);
		pilot.rotate(-90);
		pilot.steer(45,180);
		pilot.rotate(-90);
		suppress = false;	
	}

	public void suppress ()
	{
		suppress = true;
	}

	public boolean takeControl()
	{
		//check if the object distance greater than 30, return true which calls the action() method.
		return(sonar.getDistance() > 1 && sonar.getDistance() < 15);
	}
}

