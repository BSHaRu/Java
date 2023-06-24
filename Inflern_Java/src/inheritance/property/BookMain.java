package inheritance.property;

public class BookMain {

	public static void main(String[] args) {
		Book b1 = new Book();
		
		b1.setTitle("프로퍼티 예제");
		b1.setPrice(100);
		
		System.out.println(b1.getTitle());
		// set으로 100을 넣었지만, 
		// get의 return값으로는 *2로 했기때문에 200이 출력 
		System.out.println(b1.getPrice());
		
		
	}

}
