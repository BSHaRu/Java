package sub4;

public class SubThread extends Thread{

	public void run() {
		// while문인데 break로 반복문 탈출을 안함
		// -> Main에서 Daemon Thread로 종료되는거 보여줄려고
		// 여기서 break를 안함
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.err.println("sub Thread : " + e.getMessage());
			}
			System.out.println("sub Thread 실행");
		} // while end
	}
}
