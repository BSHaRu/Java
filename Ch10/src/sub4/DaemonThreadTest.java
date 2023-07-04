package sub4;

/*
 * 날짜 : 2023.07.03
 * 내용 : Java DaemonThead 실습
 * 
 * Daemon Thread
 * 	- Main Thread를 보조하는 보조 Thread
 *  - Main Thread 종료되면 Daemon Thread도 종료
 */

public class DaemonThreadTest {

	public static void main(String[] args) throws Exception {
		
		SubThread st = new SubThread();
		// Daemon Thread 설정
		// main Thread가 종료되면 자식 Thread를 강제 종료
		st.setDaemon(true);
		
		st.start();
		
		for (int i = 1; i<=10; i++) {
			Thread.sleep(1000);
			System.out.println("Main Thread 실행");
		}
		System.err.println("프로그램 종료");
		
	}

}
