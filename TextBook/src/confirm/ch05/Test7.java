package confirm.ch05;

public class Test7 {
	public static void main(String[] args) {
		int[] array = {1, 5, 3, 8, 2};
		int max = array[0];
		
		for(int i : array) {
			if(i > max) {
				max = i;
			}
		}
		System.out.println("최대값 : "+max);
	}
}
