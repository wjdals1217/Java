package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2753번 연도가 주어졌을 때 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오

public class Test03 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int year = Integer.parseInt(br.readLine());
		
		if(year>=1 && year<=4000) {
			if(year%4 == 0 && year%100!=0 || year % 400 == 0) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
	}
}
