package UnitTest;

public class UltrasonicSensorTest {

	public static void main(String[] args) 
	{
		UltrasonicSensor ULsensor = new UltrasonicSensor();
		int cpt = 0;
		while (cpt < 120)
		{
			System.out.println("Distance : "+ULsensor.getDistance()+ "cm");
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
