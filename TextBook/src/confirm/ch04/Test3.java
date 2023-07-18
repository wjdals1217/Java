package confirm.ch04;
/*
 * 날짜 : 2023/07/18
 * 이름 : 최정민
 * 내용 : 교재 138p
 */
public class Test3 {
	public static void main(String[] args) {

		while (true) {
			int nun1 =(int)Math.ceil(Math.random()*6);
			int nun2 =(int)Math.ceil(Math.random()*6);
			
			System.out.println("("+nun1+","+nun2+")");
			if(nun1+nun2 == 5)
				break;
		}
	}
}
