import lejos.robotics.subsumption.*;
import lejos.nxt.*;
import lejos.robotics.navigation.DifferentialPilot;



public class Measure{
	private	DifferentialPilot pilot = new DifferentialPilot(2.25, 4.25, Motor.A, Motor.C);		//creating a new differntial pilot object and assining it to motor A and C.
	private UltrasonicSensor sonar = new UltrasonicSensor(SensorPort.S4);	//new object for the ultrasonic sensor to detect walls.
	private LightSensor light = new LightSensor(SensorPort.S3);	//light sensor to capture the floor light value

	int floorlight = 0;
	public float width ;
	public float lenght;
	
	Measure()
	{	
		//white loop takes the width of the room.
		//keep moving forward until the wall is less than 20 units away from the sonar
		while(sonar.getDistance()>20)
		{
			pilot.forward();
			
		}
		// taking the light value and getting the room width after we finished the first section of the room.
		floorlight = light.getLightValue();
		width = pilot.getMovement().getDistanceTraveled();
		//LCD.drawString("width"+ pilot.getMovement().getDistanceTraveled(),4,2);


		pilot.rotate(90);
		//after the pilot rotates 90 dgress, he will start the another while loop to get the lenght of the room.
		while(sonar.getDistance()>20)
		{
			pilot.forward();

		}
		//storing the distance the pilot travelled since the last Tacho reset.
		lenght = pilot.getMovement().getDistanceTraveled();

		pilot.rotate(90);
		//while loop to move the robot to to the next part of the room.
		while(sonar.getDistance()>20)
		{
			pilot.forward();

		}
		pilot.rotate(90);

			//while loop to move the robot to to the next part of the room.
		while(sonar.getDistance()>20)
		{
			pilot.forward();

		}

		pilot.rotate(90);
		
		//robot should have completed all four sides of the room now. it should move on to the next Behaviour now
		// which is motor behaviour to start cleaning the room.
		
		//LCD.drawString(Integer.toString(floorlight),4,0);
		//LCD.drawString(" width " +Float.toString(width),4,2);
		//LCD.drawString("lenght" +Float.toString(lenght),4,5);
	}




	}
	

