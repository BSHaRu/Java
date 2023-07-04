package sub2;

/*
 * 날짜 : 2023.07.03
 * 내용 : Java Thread 동기화 실습
 * 
 * 동기 : 약속을 하고 진행하는거
 * 		-> 순서를 지키며 처리되는 실행 흐름
 * 비동기 : 약속을 안하고 무작위로 진행하는거
 * 		-> 순서가 없고 알아서 처리되는 실행 흐름
 *  
 */
public class ThreadSyncTest {

	public static void main(String[] args) throws Exception {
		
		Count count = new Count();
		
		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);
		
		// 스레드 생성 후 실행(비동기 방식)
		ct1.start();
		ct2.start();
		ct3.start();
		
		// 스레드 작업이 완료 후 다시 메인 스레드로 합류
		// -> 스레드 대기(다른 스레드 종료를 대기)
		ct1.join();
		ct2.join();
		ct3.join();
		
		System.out.println("count : " + count.getNum());
	} // main end
}
