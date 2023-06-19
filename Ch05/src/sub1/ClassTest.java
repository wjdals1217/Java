package sub1;

/*
 * 날짜 : 2023-/06/19
 * 이름 : 최정민
 * 내용 : Java 클래스 실습하기
 * 
 * 클래스와 객체
 * - 클래스는 객체를 생성하는 구조체이고 속성(필드, 멤버변수)과 기능(멤버 메서드)으로 설계
 * - 객체(Object)는 클래스의 실제 인스턴스(Instance), new 연산으로 생성
 * 
 */

public class ClassTest {

	public static void main(String[] args) {
		// 객체(Object, Instance)생성
		Car sonata = new Car();
		//sonata는 참조변수
		
		// 객체 초기화
		sonata.name ="소나타";
		sonata.color ="흰색";
		sonata.speed = 0;
		
		// 객체 활용
		sonata.speedUp(60);
		sonata.speedDown(20);
		sonata.show();
		
		// 객체 선언, 생성, 초기화
		Car avante;//선언
		avante = new Car();// 생성
		avante.name = "아반테";
		avante.color = "검은색";
		avante.speed = 0;
		
		avante.speedUp(80);
		avante.speedDown(40);
		avante.show();
		
		// Account 객체 생성과 초기화, 활용
		Account kb = new Account();
		kb.bank = "국민은행";
		kb.id = "101-21-0101";
		kb.name = "김유신";
		kb.balance = 10000;
		
		kb.deposit(40000);
		kb.withdraw(30000);
		kb.show();
		
		//Account 객체 생성과 초기화, 활용
		Account woori = new Account();
		woori.bank = "우리은행";
		woori.id = "101-223-00101";
		woori.name = "김춘추";
		woori.balance = 1000;
		
		woori.deposit(39000);
		woori.withdraw(7000);
		woori.show();
	}// main end

}
