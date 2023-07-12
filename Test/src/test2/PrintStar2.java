package test2;
/**
 * 날짜 : 2023/07/05
 * 이름 : 최정민
 * 내용 : 문제2.
 */
public class PrintStar2 {
	public static void main(String[] args) {
		
		int n=4;
		
		for(int i=0; i < n; i++) {
			for(int j=n-2; j>=i; j--) {
				System.out.print("☆");
			}
			for(int j=0; j<2*i+1; j++) {
				System.out.print("★");
			}
			for(int j=n-2; j>=i; j--) {
				System.out.print("☆");
			}
			System.out.println();
		}
				
	}
}
