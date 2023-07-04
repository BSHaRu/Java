package sub1;

public class SubThread extends Thread {
	
	private String name;
	
	public SubThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("sub Thread sleep : " + e.getMessage());
			}
			System.out.println(name + " : Thread 실행");
		}
		System.err.println(name + " : Thread 종료 \n");
	}
	
}
