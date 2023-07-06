package sub3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 날짜 : 2023/07/06
 * 이름 : 최정민
 * 내용 : 채팅 프로그램 실습하기
 */
public class ChatServer {
	public static void main(String[] args) {
		
		System.out.println("[Server]");
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(9001);
			
			System.out.println("연결 대기...");
			socket = serverSocket.accept();
			
			System.out.println("연결 수립...");
			
			Thread t1 = new ThreadSender(socket);
			Thread t2 = new ThreadReciever(socket);
			
			t1.start();
			t2.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}
	
}
