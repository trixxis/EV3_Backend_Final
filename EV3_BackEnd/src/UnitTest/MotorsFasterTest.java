package UnitTest;

public class MotorsFasterTest {

	public static void main(String[] args) 
	{
		Motors Mot = new Motors();
		int cpt = 0;
		Mot.forward();
		while (cpt < 5)
		{
			Mot.Faster();
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cpt++;
		}
		try {
			Mot.stop();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
