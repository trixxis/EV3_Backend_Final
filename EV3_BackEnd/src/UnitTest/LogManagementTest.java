package UnitTest;

public class LogManagementTest {

	public static void main(String[] args) 
	{
		LogManagement Log = new LogManagement();
		
		Log.writeLog("Log1\n");
		Log.writeLog("Log2\n");
		Log.writeLog("Testlog reussis\n");
		
		System.out.println(Log.ReadLog());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
