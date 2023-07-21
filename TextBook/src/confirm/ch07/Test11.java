package confirm.ch07;


class Activity {
	public void onCreate() {
		System.out.println("기본 내용 실행...");
	}
}

class MainActivity extends Activity {
	@Override
	public void onCreate() {
		super.onCreate();
		System.out.println("추가 내용 실행...");
		
	}
	
}
public class Test11 {
	public static void main(String[] args) {
		
	}
	
}
