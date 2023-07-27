package step1;

import java.util.Scanner;

/*
* (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
*(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
*세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
*/

public class Test09 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>=2 && a<=10000) {
			if(b>=2 && b<=10000) {
				if(c>=2 && b<=10000) {
					System.out.println((a+b)%c);
					System.out.println(((a%c)+(b%c))%c);
					System.out.println((a*b)%c);
					System.out.println(((a%c)*(b%c))%c);
				}
			}
		}
		
		sc.close();
	}
}
