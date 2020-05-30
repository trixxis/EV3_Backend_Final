package UnitTest;

public class VehicleBatterieTest {

	public static void main(String[] args) 
	{
		VehicleBatterie Batterie = new VehicleBatterie();
		int cpt = 0;
		while (cpt < 120)
		{
			System.out.println("Batterie: "+Batterie.getBatterieLevel()+" %");
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
