package sub9;
/**
 * 날짜 : 2023/06/22
 * 이름 : 최정민
 * 내용 : Java 인터페이스 실습하기
 * 
 * 인터페이스(Interface)
 * - 클래스 간의 공통의 표준 규격을 위한 설계 문법
 * - 인터페이스를 활용해서 객체간 결합도를 완화하는 효과(디형성)
 * - 부수적으로 다중상속 효과
 */

class Tv extends Computer implements Internet {

	@Override
	public void access() {
		surf();
	}
	
	public void powerOn() {
		booting();
	}
	
}

class Computer {
	public void booting() {
		System.out.println("시스템 부팅...");
	}
	
	public void surf() {
		System.out.println("인터넷 서핑...");
	}
}

interface Internet {
	public void access();
}



public class InterfaceTest {
	public static void main(String[] args) {
		
		// 인터페이스 활용1 - 표준화된 클래스 설계와 다형성 활용
		Car sonata = new Sedan("소나타", "흰색", 0);
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		Car bongo = new Truck("봉고", "남색", 0);
		bongo.speedUp(60);
		bongo.speedDown(20);
		bongo.show();
		
		// 인터페이스 활용2 - 결합도 완화(유연성)
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		socket.switchOn();
		socket.switchOff();
		
		// 인터페이스 활용3 - 다중 상속 효과(Java에서 다중상속은 없다./부모클래스가 2개일 수 없음)
		// 하나는 상속받고, 다른 것은 인터페이스로 구현해내면 다중 상속의 효과를 낼 수 있다. 다형성 활용은 못함
		Tv smartTv = new Tv();
		smartTv.powerOn();
		smartTv.access();
		
		
	}
}
