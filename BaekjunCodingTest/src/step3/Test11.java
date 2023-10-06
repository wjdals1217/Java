package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test11 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		/* StringTokenizer st = new StringTokenizer(문자열);
		 * => 띄어쓰기 기준으로 문자열을 분리
		 * StringTokenizer st = new StringTokenizer(문자열, 구분자);
		 * => 구분자를 기준으로 문자열을 분리
		 * StringTokenizer st = new StringTokenizer(문자열, 구분자, true/false);
		 * => 구분자를 기준으로 문자열을 분리할 때 구분자도 토큰으로 넣을지(true)
		 * 	  구분자는 분리된 문자열 토큰에 포함시키지 않을지(false)(디폴트는 false)
		 */
		long a = Long.parseLong(st.nextToken()); 
		long b = Long.parseLong(st.nextToken()); 
		long c = Long.parseLong(st.nextToken()); 
		
		System.out.print(a + b + c);
	}

}
