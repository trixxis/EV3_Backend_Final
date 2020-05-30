package UnitTest;

public class VehicleScreenTest {

	public static void main(String[] args) 
	{
		VehicleScreen LCD = new VehicleScreen();
		LCD.setLcdInformation("Test de l'ecran...", 3);
		LCD.setLcdInformation("Reussis", 4);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
