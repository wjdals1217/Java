package step2;

import java.util.Scanner;

// 2525번 오븐시계

public class Test06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int C = sc.nextInt();
		
		int min = 60 * A + B;
		
		min +=C;
		
		int hour = (min/60)%24;
		
		int minute = min % 60;
		
		System.out.println(hour + " "+minute);
	}
}
