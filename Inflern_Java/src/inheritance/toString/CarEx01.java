package inheritance.toString;

/*
 * toString(), equals() & hasCode()는 반드시 오버라이딩 해서 사용
 * 
 * 『모든 객체의 최상위 객체는 Object임
 * ->Object는 모든 객체의 부모 타입인거임』
 * 
 * println() 메서드는 println(Object x)를 들고있기때문에
 * println(c1)을 출력을 할 수 있는거임
 * 이때 println()의 반환값은 String.valueOf()를 호출하는거고
 * valueOf()는 obj.toString()를 호출하게 됨
 * 즉, println(c1) == println(c1.toString());이랑 같음
 * => toSting()을 재정의 안하고 쓰면 아무런 쓸모가 없음(참조하고 있는 주소값을 출력)
 * ==> 메서드를 재정의 한다? Object는 모든 객체의 부모 타입이다? Overriding을 해야된다. 
 * 
 */

public class CarEx01 {
	
	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(c1);
		
	}
}
