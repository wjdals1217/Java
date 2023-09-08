package step2;

import java.util.Scanner;

public class Test01 {
	
	// 1330번 두 수 비교하기
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		if(a > b) {
			System.out.println(">");
		}else if(a < b) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
	}
}
