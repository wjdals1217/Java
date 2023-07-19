package confirm.ch05;

public class Test3 {
	public static void main(String[] args) {
		//3번
		String str1 = new String("Hello");
		String str2 = "Hello";
		String str3 = "Hello";
		
		System.out.println(str1);
		System.out.println(str2);
		
		if(str2 == str3) {
			System.out.println("서로 같다.");
		}else {
			System.out.println("서로 다르다. ");
		}
	}
}
