package sub4;

/**
 * 날짜 : 2023/06/27
 * 이름 : 최정민
 * 내용 : Java Math 클래스 실습하기
 * 
 */
public class MathTest {
	public static void main(String[] args) {
		
		//Math math = new math();=> private 생성자이기 때문에 객체 생성X 싱글톤도 아님
		
		// 기본 메서드
		System.out.println("절대값 : "+ Math.abs(-5));
		System.out.println("제곱근 : "+ Math.sqrt(9));
		System.out.println("올림값 : "+ Math.ceil(1.2));
		System.out.println("올림값 : "+ Math.ceil(1.8));
		System.out.println("내림값 : "+ Math.floor(1.2));
		System.out.println("내림값 : "+ Math.floor(1.8));
		System.out.println("반욜림 : "+ Math.round(1.2));
		System.out.println("반올림 : "+ Math.round(1.8));
	
		// random 메서드(double만)
		
		double num1 = Math.random();
		System.out.println("num1 : "+ num1);// 0이상 1미만의 실수
		
		double num2 = num1 *10;
		System.out.println("num2 : " + num2); //0이상 10미만의 실수
		
		double num3 = Math.ceil(num2);
		System.out.println("num3 : " + num3); //0이상 10미만의 정수
		
		//1~45 사이 임의의 정수
		int rand = (int) Math.ceil(Math.random() * 45);
		System.out.println("rand : "+rand);
		
	}
	
}
