
public class Slayer extends Thread {

ZombiCounter zc;
	
	public Slayer(ZombiCounter zombieCounter) 
	{ 
		this.zc = zombieCounter;
	}
	
	@Override
	public void run() {
		
		while (!zc.tooManyZombiesInTheRoom() && !zc.killed100Zombies()) 
		{ 
			zc.zombieKilled();
			try 
			{
				Thread.sleep(2);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			} 
		} 
	}

}
