
public class ZombiCounter {
	
	private int count = 0;
	private int killed = 0;

	synchronized void zombieEntered()
	{
		count++;
	}	
	
	synchronized void zombieKilled()
	{
		count--;
		killed++;
	}
	
	synchronized boolean tooManyZombiesInTheRoom()
	{
		return count > 100;
	} 
	
	synchronized boolean killed100Zombies()
	{ 
		return killed > 100;
	}
	
	synchronized boolean zombiesExist()
	{
		return count > 0;
	}
	
	synchronized int getKilledCount()
	{
		return killed;
	}
	
	synchronized int getInTheRoomCount()
	{
		return count;
	}
	
}
