package sub2;

/*
 * 날짜 : 2023/06/15
 * 이름 : 최정민
 * 내용 : Java 메서드 실습하기
 */
public class MethodTest {
	
	//전역 변수 : class에서 선언된 변수
	int num = 1;
	
	// main method : 프로그램 진입점
	public static void main(String[] args) {
		
		//메서드 호출
		int y1 = f(1);
		int y2 = f(2);
		int y3 = f(3);
		
		System.out.println("y1 : " + y1);
		System.out.println("y2 : " + y2);
		System.out.println("y3 : " + y3);
		
		
		// 메서드 지역변수와 스택
		int t1 = sum(1, 10);
		int t2 = sum(1, 100);
		
		System.out.println("t1 : "+t1);
		System.out.println("t2 : "+t2);
			//스택 = 메모리
			//지역변수 : 메서드에서 선언된 변수, 메서드가 종료되면 스택에서 해제
	}
	
	
	// 메서드 정의(static 예외적으로 넣어줌 원래는 없다)
	public static int f(int x) {
		
		int y = 2 * x +3;
		return y;
		//void : 리턴타입(반환하지 않음)
		//리턴되는 타입값을 선언해줘야함
	}
	
	// 메서드 정의
	public static int sum(int start, int end) {
		
		
		int total = 0;
		
		for(int k=start ; k<=end ; k++) {
			
			total += k;
		}
		
		return total;
	}

}
