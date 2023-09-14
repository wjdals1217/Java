package step2;

import java.util.Scanner;

// 2480번 주사위 3개

public class Test07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max;
		if(a>b) {
			if(c > a) {
				max = c;
			}else {
				max = a;
			}
		}else {
			if(c>b) {
				max=c;
			}else {
				max = b;
			}
		}
		
		if(a != b && a!=c && b!=c) {
			System.out.println(max*100);
		}else if(a == b && a == c) {
			System.out.println(10000+a*1000);
		}else if(a == b || a == c) {
			System.out.println(1000+a*100);
		}else if(b == c){
			System.out.println(1000+b*100);
		}
	}
}
