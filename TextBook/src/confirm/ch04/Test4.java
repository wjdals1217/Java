package confirm.ch04;
/*
 * 날짜 : 2023/07/18
 * 이름 : 최정민
 * 내용 : 교재 138p
 */
public class Test4 {
	public static void main(String[] args) {
		for(int x=1; x<=10; x++) {
			for(int y=1; y <=10; y++) {
				int result = 4*x + 5*y;
				
				if(result == 60) {
					System.out.println("("+x+","+y+")");
				}
				
			}
		}
	}
}
