import lejos.robotics.subsumption.*;
import lejos.nxt.*;
import lejos.robotics.navigation.DifferentialPilot;


public class Measure{
	private DifferentialPilot pilot = new DifferentialPilot(2.25, 4.25, Motor.A, Motor.C);
	private UltrasonicSensor sonar = new UltrasonicSensor(SensorPort.S4);
	private LightSensor light = new LightSensor(SensorPort.S3);

	 int light=0;
	float[] length=new float[];
	float width;
	float length;
	int i=0;

	
		while(sonar.getDistance()<20)
		{
			pilot.forward();

		}
		
		pilot.rotate(90);
		i++;
		
		while(sonar.getDistance()<20)
		{
			pilot.forward();

		}

		pilot.rotate(90);
		i++;
		while(sonar.getDistance()<20)
		{
			pilot.forward();

		}

		pilot.rotate(90);
		i++;
		while(sonar.getDistance()<20)
		{
			pilot.forward();

		}

		pilot.rotate(90);
		i++;


	}
	

