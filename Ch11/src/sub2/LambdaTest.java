package sub2;

// 람다식으로 사용 하겠다는 어노테이션
@FunctionalInterface
interface A{
	public int method(int a, int b);
}

@FunctionalInterface
interface B{
	public void method(double a);
}

@FunctionalInterface
interface C{
	public boolean method();
}

@FunctionalInterface
interface D{
	public void method();
}

public class LambdaTest {

	public static void main(String[] args) {
		
		// 람다식 정의
		A a1 = (int a, int b) -> {
			int c = a + b;
			return c;
		};
		
		// 이미 인터페이스에서 타입을 정했기 때문에 
		// 매개변수 타입도 생략이 가능하다
		A a2 = (a, b) -> { return a+b; };
		
		// 추상 메소드이면서 실행문이 하나일 경우에는
		// 중괄호와 return도 생략이 가능하다.
		// ※ 실행문이 두개 이상일 때는 중괄호 반드시 필요!!!
		A a3 = (a, b) -> a+b;
		
		int r1 = a1.method(1, 2);
		int r2 = a2.method(1, 2);
		int r3 = a3.method(1, 2);
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		
		System.out.println("=====================================");
		
		B b1 = (double a) -> {
			System.out.println("b1의 a : " +a);
		};
		// 매개변수 괄호를 제거할 경우 타입을 붙이면 안됨
		B b2 = a -> System.out.println("b2의 a : " + a);
		
		B b3 = System.out::println;
		
		b1.method(1.0);
		b2.method(2.1);
		b3.method(3.4);
		
		System.out.println("=====================================");
		
		C c1 = () -> {return true;};
		
		C c2 = () -> false;
		
		System.out.println("c1 : " + c1.method());
		System.out.println("c2 : " + c2.method());
		
		System.out.println("=====================================");
		
		D d1 = () -> {System.out.println("d1 실행");};
		D d2 = () -> System.out.println("d2 실행");
		
		d1.method();
		d2.method();
		
		System.out.println("=====================================");
		
		// 람다식 활용
		Runnable run = () ->{
			for(int i=1; i<=10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("서브 스레드 실행");
			} // for end
		}; // run end
		
		Thread thread = new Thread(run);
		thread.start();
		
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("메인 스레드 실행");
		} // for end
		
		System.err.println("프로그램 종료");
		
	} // main end

}
