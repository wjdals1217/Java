package test1;

import java.util.Scanner;

/**
 * 날짜 : 2023/07/05
 * 이름 : 최정민
 * 내용 : 문제1.
 */
public class PrintStar {
	 public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("숫자입력: ");
		 int n = sc.nextInt();
		 
		 if (n>=1 && n<=100) {
			 for(int i = 0 ; i<n ; i++) {
					
					for(int j=n-1 ; j > i ; j--) {
						System.out.print(" ");
					}
				
					for(int j=0 ; j < i + 1 ; j++) {
						System.out.print("*");
					}
				
					System.out.print("\n");
			 }
			 sc.close();
		 }else {
			 System.out.println("1이상 100이하의 숫자를 입력해주세요.");
		 }
	}
}
