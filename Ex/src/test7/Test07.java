package test7;

interface Play{
	
	public void play();
}

class BaseBallPlayer implements Play{

	@Override
	public void play() {
		System.out.println("야구를 합니다.");
	}
	
}

class FootBallPlayer implements Play{

	@Override
	public void play() {
		System.out.println("축구를 합니다.");
	}
}

public class Test07 {

	public static void main(String[] args) {
		Play p1 = new BaseBallPlayer();
		Play p2 = new FootBallPlayer();
		
		playGame(p1);
		playGame(p2);
	} // main end

	private static void playGame(Play p) {
		p.play();
	}

}
