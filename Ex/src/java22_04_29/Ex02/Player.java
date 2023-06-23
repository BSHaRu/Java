package java22_04_29.Ex02;

public class Player extends PlayerLevel {
	
	// 자식 클래스를 필드값으로 가져옴
	// -> 아래쪽에서 호출을 하기 떄문에
	private AdvancedLevel level1;
	private SuperLevel level2;
	
	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("jump 못하지롱");
	}

	@Override
	public void turn() {
		System.out.println("turn 못하지롱");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*** 초급자 레벨입니다 ***");
	}

	public void play(int i) {
		if(i==1) {
			showLevelMessage();
			// PlayerLevel을 상속하고 있기때문에 해당 메서드를 바로 호출가능
			go(i);
		}else if (i == 2 ) {
			level1.showLevelMessage();
			go(i);
		}else {
			level2.showLevelMessage();
			go(i);
		}
	}

	public void upgradeLevel(AdvancedLevel aLevel) {
		// 초기화
		this.level1 = aLevel;
	}

	public void upgradeLevel(SuperLevel sLevel) {
		this.level2 = sLevel;
	}

}
