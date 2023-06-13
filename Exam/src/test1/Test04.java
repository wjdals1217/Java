package test1;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수입력 : ");
		int score = sc.nextInt();
		char grade = 
		
		System.out.println("입력한 점수는 " + score + "입니다.");
		
		if(score >= 80) {
			grade = 'A';
		}else if(score >=60 && score < 80) {
			grade = 'B';
		}else if(score >=40 && score < 60) {
			grade = 'C';
		}else if(score >=20 && score < 40) {
			grade = 'D';
		}else {
			grade ='F';
		}
		System.out.printf("등급은 %c입니다.", grade);
	}

}
