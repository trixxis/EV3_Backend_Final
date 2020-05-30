package UnitTest;

public class MotorsMaxSpeedTest {

	public static void main(String[] args) 
	{
		Motors Mot = new Motors();
		int cpt = 0;
		while (cpt < 120)
		{
			System.out.println("Max : "+Mot.getMaxSpeed());
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
