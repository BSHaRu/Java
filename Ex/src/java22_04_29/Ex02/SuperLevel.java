package java22_04_29.Ex02;

public class SuperLevel extends Player {
	
	@Override
	public void run() {
		System.out.println("엄청 빠르게 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("더 높이 jump 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("turn 합니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*** 고급자 레벨입니다 ***");
	}
}
