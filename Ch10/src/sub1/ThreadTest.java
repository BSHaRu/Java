package sub1;

/*
 * 날짜 : 2023.07.03
 * 내용 : Java Thread 실습
 *  
 * Thread
 *  - 하나의 프로세스 안에서 실행되는 프로그램의 실행 흐름
 *  - Thread는 동시에 실행 => 병행 실행
 *  - Thread 클래스를 상속 받아 start 실행 
 */

public class ThreadTest {
	public static void main(String[] args) {
		
		SubThread st1 = new SubThread("sub1");
		SubThread st2 = new SubThread("sub2");
		
		// 새로운 작업 스레드 생성
		st1.start();
		// run()은 호출이지 새로운 스레드 생성이 아님
//		st1.run();
		st2.start();
		
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Main thread sleep : " +e.getMessage());
			}
			System.out.println("Main Thread 실행");
		}
		System.err.println("Main Thread 종료 \n");
		
		
	} // main end
}
