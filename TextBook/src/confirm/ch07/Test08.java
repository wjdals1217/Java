package confirm.ch07;

class Tire {
	public void run() {
		System.out.println("일반 타이어 굴러감...");
	}
}

class SnowTire extends Tire {
	@Override
	public void run() {
		System.out.println("스노우 타이어 굴러감...");

	}
}

public class Test08 {
	public static void main(String[] args) {
		
		
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run();
		tire.run();

	}
}