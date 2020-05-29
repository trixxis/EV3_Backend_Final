package BackEnd;

import lejos.hardware.Sound;

public class VehicleSound {
	
	public VehicleSound()
	{
		
	}
	
	public void beep()//play a simple beep sound
	{
		Sound.beep();
	}
	
	public void Ton1(int dur�e) //play a ton at a frequency of 500 Hzr
	{
		Sound.playTone(500, dur�e);
	}
	
	public void Ton2(int dur�e)//play a ton at a frequency of 1000 Hzr
	{
		Sound.playTone(1000, dur�e);
	}
	
	public void Ton3(int dur�e)//play a ton at a frequency of 1500 Hzr
	{
		Sound.playTone(1500, dur�e);
	}

}

