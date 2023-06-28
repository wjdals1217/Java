package sub2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 날짜 : 2023/06/28
 * 이름 : 최정민
 * 내용 : Java 자료구조 Queue 실습하기
 * 
 * 큐(Queue)
 * - 큐는 데이터가 차례대로 쌓이는 자료구조(FIFO:선입선출)
 * - 이벤트, 애니메이션 실행에 사용
 * - stack은 push, pull이고 queue는 offer, poll
 */

public class QueueTest {
	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		//자바에는 인터페이스로만 구현되어있음, LinkedList를 써줘야 한다.
		
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}
}
