package sub3;

// ����� ���� ���� Ŭ����
class MinusException extends Exception{
	
	public MinusException(String msg) {
		super(msg);
	}
}

class OverException extends Exception{
	public OverException(String msg) {
		super(msg);
	}
}

class Score{
	public void check(int score) 
			throws MinusException, OverException {
		
		if(score < 0) {
			// ���� �߻� ��Ű��
			throw new MinusException("������ ������ �� �� �����ϴ�.");
		}else if(score > 100) {
			// ���� �߻� ��Ű��
			throw new OverException("������ 100�� �ʰ��� �� �����ϴ�.");
		}else {
			System.out.println("���� �̻� ��");
		}
		
	}
}

public class ThrowEx {

	public static void main(String[] args) {
		
		Score score = new Score();
		
		try {
			score.check(-3);
			score.check(102);
			score.check(96);
		} catch (MinusException e) {
			e.printStackTrace();
		} catch (OverException e) {
			e.printStackTrace();
		}
		
		System.out.println("���α׷� ����");
	}

}
