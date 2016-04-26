import lejos.robotics.subsumption.*;
import lejos.nxt.*;
import lejos.robotics.navigation.DifferentialPilot;
/* 
Mobile Robotics
Assignment 2  
Maciej Piotrowski C13470112
Abdulellah Hakim D12122837
*/
public class seewalls implements Behavior{

	private DifferentialPilot pilot = new DifferentialPilot(2.25, 4.25, Motor.A, Motor.B);
	private UltrasonicSensor sonar = new UltrasonicSensor(SensorPort.S4);
	boolean suppress = false;
	public float length1;
	public float width1;
	public float ws;
	private boolean direction = true;

	public seewalls(float length,float width)
	{
		length1 = length;
		width1 = width;
		ws = pilot.getMovement().getDistanceTraveled();
		LCD.drawString(" width " +Float.toString(ws),4,2);
	}
	public void action(){
	
		//moves the robot forward
		suppress = false;	
		if(direction == true)
		{
			pilot.rotate(90);
			pilot.travel(7);
			pilot.rotate(90);
			direction = false;
		}
		else 
		{
			pilot.rotate(-90);
			pilot.travel(7);
			pilot.rotate(-90);
			direction = true;
		}
		
	}
	
	public void suppress(){
		suppress = true;
	}

	public boolean takeControl()
	{	
		
		if(sonar.getDistance() > 35 && sonar.getDistance() < 28 )
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
