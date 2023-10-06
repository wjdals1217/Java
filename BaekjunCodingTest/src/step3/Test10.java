package step3;

//2588번 곱셈문제
//(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        System.out.println(c * (d % 10));            // 10으로 나눠준 값의 나머지 값
        System.out.println(c * (d % 100 / 10));        // 100으로 나눠준 값의 나머지를 10으로 나눈 
        System.out.println(c * (d / 100));            // 100으로 나눠준 값
        System.out.println(c * d);
    }
}
