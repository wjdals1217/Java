package test5;

/*
 * 날짜 : 2023/07/17
 * 이름 : 최정민
 * 내용 : 자바 총정리 연습문제
 */

public class Test09 {
	public static void main(String[] args) {
		
		int count = 0;
		
		for(int i = 0; i < 7 ; i++) {
			if(i <=3)
				count++;
			//count = 1
			else
				count--;
			for(int j = 1; j < 5 - count ; j++)
				//count= 1 i=0,j=1, 1<5, 별 하나, j=2...흰별 3개
				//count= 2, i=1, j=1, 1<3, 별 하나, j=2, ... 흰별 2개
				System.out.print("☆");
			for (int k =1; k <= 2*count -1; k++)
				//count = 1 i=0, j=1, k=1, 별 하나, k=2, 실행되면 안됨
				//count = 2 i=1, j=1, k=1, 별 하나, k=2, 3개 만들어져야함
				System.out.print("★");
			for (int j = 1; j < 5 - count ; j++)
				System.out.print("☆");
			
			System.out.print("\n");
		}
		
		System.out.print("\n");
	}
}
