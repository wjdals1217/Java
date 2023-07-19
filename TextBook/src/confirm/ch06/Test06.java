package confirm.ch06;

public class Test06 {
	public static void main(String[] args) {
		method(1);
		method(1, 2);
		method(1, 2, 3);
		method(1, 2, 3, 4);
	}

	public static void method (int ...num) {
		for(int n : num) {
			System.out.print(n);
		}
		System.out.println();
	}
}
