import lejos.nxt.*;
import lejos.robotics.subsumption.*;
import lejos.robotics.navigation.DifferentialPilot;

public class object implements Behavior {

	//sonar sensor and differntial pilot.
	private UltrasonicSensor sonar = new UltrasonicSensor(SensorPort.S3);
	private DifferentialPilot pilot = new DifferentialPilot(2.25, 4.25, Motor.A, Motor.C);
	private boolean suppress = false;

	

	
	public void action()
	{	//travelling in a circual path tutorial.
		// http://www.lejos.org/nxt/nxj/tutorial/WheeledVehicles/SteerTest.java
		LCD.clear();
		//pilot steer will make the robot keep moving staright while rotating the wheels with an angle.
		LCD.drawString("avoiding object",0, 0);
		pilot.steer(35,75);
		suppress = false;
		
	}

	public void suppress ()
	{
		suppress = true;
	}

	public boolean takeControl()
	
	{
       
		//check if the object distance greater than 30, return true which calls the action() method.
     if(sonar.getDistance() < 30)
   		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}

