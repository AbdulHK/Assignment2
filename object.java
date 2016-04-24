import lejos.nxt.*;
import lejos.robotics.subsumption.*;
import lejos.robotics.navigation.DifferentialPilot;

public class light implements Behavior {

	//sonar sensor and differntial pilot.
	private UltrasonicSensor sonar = new UltrasonicSensor(SensorPort.S3);
	private DifferentialPilot pilot = new DifferentialPilot(2.25, 4.25, Motor.A, Motor.C);
	private boolean suppress = false;

	
	

	
	public void action()
	{	//travelling in a circual path tutorial.
		// http://www.lejos.org/nxt/nxj/tutorial/WheeledVehicles/SteerTest.java
		LCD.clear();
		
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
       

     if(sonar.getDistance() < 25);
   		{
		
		
			return true;
		}
		else
		{
			return false;
		}
		
				
	}
}

