package test6;

/*
 * 날짜 : 2023/07/18
 * 이름 : 최정민
 * 내용 : 자바 총정리 연습문제
 */

public class Test08 {
	public static void main(String[] args) {
		
		int count = 0;
		
		for (int i = 2; i <= 100; i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
				count++;
			}
		}
	}
	
	public static boolean isPrime(int x) {
		for(int i =2; i < x; i++) {
			if(x % i == 0) {
				return false;
			}
		}
		return true;
	}
}
