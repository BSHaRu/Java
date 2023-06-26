package factoryMethod;

public class BeanFactoryMain {

	public static void main(String[] args) {
		
		BeanFactory bf1 = BeanFactory.getInstance();
		BeanFactory bf2 = BeanFactory.getInstance();
		
		if(bf1 == bf2)	System.out.println("bf1 == bf2");
		
		System.out.println("-------------------");
		
		// 팩토리 메서드 패턴을 이용한 객체 생성
		Bus b1 = bf1.getBus();
		Bus b2 = bf2.getBus(); 
		
		if(b1 == b2) {
			System.out.println("b1 == b2");
		} else {
			System.out.println("b1 != b2");
		}
		
	}

}
