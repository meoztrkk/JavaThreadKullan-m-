public class Main{

	public static void main(String[] args) { 
		
		ZombiCounter zc = new ZombiCounter();
		Slayer slayer = new Slayer(zc);

		int n = 2;

		DoorMan[] doormans = new DoorMan[n];
		for (int i = 0; i < n; i++) {
			doormans[i] = new DoorMan(zc);
		}

		for (int i = 0; i < n; i++) {
			doormans[i].start();
		}
		slayer.start();

		try {
			slayer.join();
			for (int i = 0; i < n; i++) {
				doormans[i].join();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("\nYou " + (zc.killed100Zombies() ? " Won!" : " Lost!"));
		System.out.println("\nthe number of zombies : " + zc.getInTheRoomCount());
		System.out.println("\nthe number of killed zombies : " + zc.getKilledCount());


	}

}