package templateMethodPattern.ex;

/*
 * Controller의 종류가 여러개.
 * 	-> 종류가 여러개 : 부모클래스로 냅두고 상속을 시키면 된다.
 * 초기화 - 같은 코드
 * 실행 	- 다른 코드
 * 마무리 - 같은 코드
 */

public abstract class Controller {
	// protected : 상속을 받거나, 같은 패키지 내에서만 사용 가능
	// final을 붙이면 자식클래스가 overriding이 안됨
	protected final void init() {
		System.out.println("초기화 코드");
	}
	
	protected final void close() {
		System.out.println("마무리 코드");
	}
	
	// 실행 하는 메서드 ->	실행은 다르니깐 추상 메서드로 구현
	protected abstract void run();
	
	// 초기화 -> 실행 -> 마무리 순으로 동작해야되니깐 여기서 만듬
	// 내가 가지고 있는 메서드를 호출을 하는데 어떤 순서가 있음
	// -> 템플릿 메서드라고함
	// => 순서가 있기 때문에 특정 메서드를 다른 클래스에서 호출하는걸 막고
	// 순서를 지정한 메서드를 호출 하게 하는 패턴
	public void excute() {
		// 초기화
		this.init(); // this 생략 가능
		// 실행
		this.run();
		// 마무리
		this.close();
	}
}
