package anonymous;

// 솔직히 이거 뭔지 제대로 모르겟음
public class MyRunnableMain {

	public static void main(String[] args) {
		MyRunnable my = new MyRunnable() {
			@Override
			public void run() {
				System.out.println("Anonymous 달림");
			}
		};
		
		my.run();
		
		System.out.println("---------------------");
		
		MyRunnable myRunnable = new MyRunnable() {
			@Override
			public void run() {
				System.out.println("Hello");
			}
		};
		
		RunnableExeute runnableExeute = new RunnableExeute();
		runnableExeute.execute(myRunnable);
		
		System.out.println("---------------------");
		
		RunnableExeute re = new RunnableExeute();
		
		runnableExeute.execute(new MyRunnable() {
			@Override
			public void run() {
				System.out.println("Hi");
			}
		});
		
		System.out.println("---------------------");
		
		runnableExeute.execute(() -> {
			System.out.println("Lambda Hi");
		});
		
	} // main end

}
