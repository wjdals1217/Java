package test6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * 날짜 : 2023/07/18
 * 이름 : 최정민
 * 내용 : 자바 총정리 연습문제
 */
public class Test06 {
	public static void printArray(String tit, int[] array) {
		System.out.println(tit);
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%5d%s", array[i], (i % 10 ==9)? "\n" : "");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random random = new Random();
		int[] values = new int[30];
		
		for (int i = 0; i < 30; i++) {
			values[i] = random.nextInt(1000);
		}
		printArray("정렬 전", values);
		
		Arrays.sort(values);
		int findNum = sc.nextInt();
		int count = 0;
		
		// 선형탐색
		for (int i = 0; i < values.length - 1; i++) {
			
		}
	}
}
