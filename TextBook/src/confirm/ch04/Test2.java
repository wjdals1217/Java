package confirm.ch04;
/*
 * 날짜 : 2023/07/18
 * 이름 : 최정민
 * 내용 : 교재 138p
 */
public class Test2 {
	public static void main(String[] args) {
		
		int sum =0;
		
		for(int i = 1; i<=100; i++) {
			if(i%3 == 0) {
				sum +=i;
			}
		}
		System.out.println("3의 배수 총합 : "+sum);
	}
}
