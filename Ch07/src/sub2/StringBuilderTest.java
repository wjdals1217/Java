package sub2;

/**
 * 날짜 : 2023/06/27
 * 이름 : 최정민
 * 내용 : Java String 클래스 실습하기
 */

public class StringBuilderTest {
	
	public static void main(String[] args) {
		
		// String immutable 특성
		String str = "Java";
		System.out.println(str);
		System.out.println("str 객체주소 : " + System.identityHashCode(str));
		
		str += "Programming";
		System.out.println(str);
		System.out.println("str 객체주소 : " + System.identityHashCode(str));
		
		// String의 immutable 특성을 개선한 StringBuilder
		StringBuilder sb = new StringBuilder("Java");
		System.out.println(sb);
		System.out.println("sb 객체 주소 : "+ System.identityHashCode(sb));
		
		sb.append("Programming");
		System.out.println(sb);
		System.out.println("sb 객체 주소 : "+ System.identityHashCode(sb));
	}
}
