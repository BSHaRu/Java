package sub3;

// java에서는 상속을 2개 못 받기 때문에
// run을 재정의 하기 위해서 인터페이스인 Runnable을 받은거임
public class AddThread extends Add implements Runnable {
	private int start;
	private int end;
	
	public AddThread(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		for(int k=start; k<=end; k++) {
			setNum(k);
		}
	}

}
