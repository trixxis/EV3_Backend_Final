package BackEnd;

import lejos.hardware.Sound;

public class VehicleSound {
	
	public VehicleSound()
	{
		
	}
	
	public void beep()
	{
		Sound.beep();
	}
	
	public void Ton1(int dur�e)
	{
		Sound.playTone(500, dur�e);
	}
	
	public void Ton2(int dur�e)
	{
		Sound.playTone(1000, dur�e);
	}
	
	public void Ton3(int dur�e)
	{
		Sound.playTone(1500, dur�e);
	}

}

