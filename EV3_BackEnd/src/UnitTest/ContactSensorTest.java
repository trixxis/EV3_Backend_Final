package UnitTest;

public class ContactSensorTest {

	public static void main(String[] args) 
	{
		ContactSensor Csensor = new ContactSensor();
		int cpt = 0;
		while (cpt < 120)
		{
			System.out.println("Contact : "+Csensor.getContact());
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
