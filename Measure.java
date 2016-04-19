import lejos.robotics.subsumption.*;
import lejos.nxt.*;
import lejos.robotics.navigation.DifferentialPilot;



public class Measure{
	
	private	DifferentialPilot pilot = new DifferentialPilot(2.25, 4.25, Motor.A, Motor.C);
	private UltrasonicSensor sonar = new UltrasonicSensor(SensorPort.S4);
	private LightSensor light = new LightSensor(SensorPort.S3);

	int floorlight = 0;
	public float width ;
	public float lenght;
	
	Measure()
	{	

		while(sonar.getDistance()>20)
		{
			pilot.forward();
			
		}
		
		floorlight += light.getLightValue();
		width = pilot.getMovement().getDistanceTraveled();
		//LCD.drawString("width"+ pilot.getMovement().getDistanceTraveled(),4,2);
		pilot.rotate(90);
		
		while(sonar.getDistance()>20)
		{
			pilot.forward();

		}
		
		floorlight += light.getLightValue();
		lenght = pilot.getMovement().getDistanceTraveled();

		pilot.rotate(90);
		
		while(sonar.getDistance()>20)
		{
			pilot.forward();

		}
		floorlight += light.getLightValue();
		pilot.rotate(90);
		
		while(sonar.getDistance()>20)
		{
			pilot.forward();

		}
		floorlight += light.getLightValue();
		pilot.rotate(90);
	
		
		//LCD.drawString(Integer.toString(floorlight),4,0);
		//LCD.drawString(" width " +Float.toString(width),4,2);
		//LCD.drawString("lenght" +Float.toString(lenght),4,5);
	}




	}
	

