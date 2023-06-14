package test1;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/13
 * 이름 : 최정민
 * 내용 : 자바 삼항연산자 연습문제
 */
public class Test06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x값 입력 : ");
		int x = sc.nextInt();
		
		System.out.print("y값 입력 : ");
		int y = sc.nextInt();
		
		String result = x > y ? "x가 더 큽니다." : "y가 더 큽니다.";
		// 식이 참이면 처음 값이 나오고, 거짓이면 뒤에 값이 나온다.
		System.out.println(result);
		
		sc.close();
	}

}
