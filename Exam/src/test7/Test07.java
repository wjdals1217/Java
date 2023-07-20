package test7;
/*
 * 날짜 : 2023/07/20
 * 이름 : 최정민
 * 내용 : 자바 총정리 연습문제
 */

interface Player {
	public abstract void play();
}

class BasBallPlayer implements Player {
	@Override
	public void play() {
		System.out.println("야구를 합니다.");
	}
}

class FootBallPlayer implements Player {
	@Override
	public void play() {
		System.out.println("축구를 합니다. ");
	}
}

public class Test07 {
	public static void main(String[] args) {
		Player p1 = new BasBallPlayer();
		Player p2 = new FootBallPlayer();
		
		playGame(p1);
		playGame(p2);
	}
	
	public static void playGame(Player p) {
		p.play();
	}
}
