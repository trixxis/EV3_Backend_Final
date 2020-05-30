package UnitTest;

public class GyroSensorTest {

	public static void main(String[] args) 
	{
		GyroSensor Gsensor = new GyroSensor();
		int cpt = 0;
		while (cpt < 120)
		{
			System.out.println("Angle: "+Gsensor.getAngle()+" degre");
			try 
			{
				Thread.sleep(250);
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cpt++;
		}

	}

}
