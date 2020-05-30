package UnitTest;

public class MotorsSlowerTest {

	public static void main(String[] args) 
	{
		Motors Mot = new Motors();
		int cpt = 0;
		Mot.forward();
		while (cpt < 5)
		{
			Mot.Slower();
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
