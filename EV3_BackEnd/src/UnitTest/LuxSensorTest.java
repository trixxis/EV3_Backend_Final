package UnitTest;

public class LuxSensorTest {

	public static void main(String[] args) 
	{
		LuxSensor Lsensor = new LuxSensor();
		int cpt = 0;
		while (cpt < 120)
		{
			System.out.println("Luminosite : "+Lsensor.getLux()+ "%");
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
