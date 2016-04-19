import lejos.robotics.subsumption.*;
import lejos.nxt.*;
import lejos.robotics.navigation.DifferentialPilot;


public class Measure{
	private DifferentialPilot pilot = new DifferentialPilot(2.25, 4.25, Motor.A, Motor.C);
	private UltrasonicSensor sonar = new UltrasonicSensor(SensorPort.S4);
	private LightSensor light = new LightSensor(SensorPort.S3);

	 int light;
	float[] size=new float[];
	float width;
	float length;


		light = light.getLightValue();

		while(sonar.getDistance()<20)
		{
			pilot.forward();

		}

		pilot.rotate(90);

		light += light.getLightValue();

		while(sonar.getDistance()<20)
		{
			pilot.forward();

		}
		//store lights value after each turn


		pilot.rotate(90);

		light += light.getLightValue();

		while(sonar.getDistance()<20)
		{
			pilot.forward();

		}


		pilot.rotate(90);
		light += light.getLightValue();

		while(sonar.getDistance()<20)
		{
			pilot.forward();

		}

		pilot.rotate(90);



	}
	

