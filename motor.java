import lejos.robotics.subsumption.*;
import lejos.nxt.*;
import lejos.robotics.navigation.DifferentialPilot;


public class motor implements Behavior{

	private DifferentialPilot pilot = new DifferentialPilot(2.25, 4.25, Motor.A, Motor.C);
	private boolean suppress = false;
	
	public void action(){
	//suppress = false;
		pilot.forward();
	}
	
	public void suppress(){
		suppress = true;
	}

	public boolean takeControl(){
		return true;
	}
	
	
}
