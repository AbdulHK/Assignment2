import lejos.robotics.subsumption.*;
import lejos.nxt.*;
import lejos.robotics.navigation.DifferentialPilot;


public class Move implements Behavior{
	
	private boolean suppressed = false;
	private DifferentialPilot pilot = new DifferentialPilot(2.25, 4.25, Motor.A, Motor.C);
	



	public void action(){
		suppressed = false;
		pilot.forward();
	}
	
	public void suppress(){
		suppressed = true;
	}

	public boolean takeControl(){
		return true;
	}

}