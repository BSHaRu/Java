package inheritance.property;

/*
 *  price 필드 : 필드에 선언된 price
 *  price property : price의 getter, setter 메서드
 */

public class Book {

	private String title;
	private int price;

	// 필드의 값을 수정하고 얻기 위한 메서드 만듬
	// -> getter, setter 
	// => property
	
	public int getPrice() {
		// this는 내 자신 인스턴스를 참조
		// cf) static은 인스턴스를 없어도 사용가능하기 때문에 this 사용못함
		return this.price * 2; // 여기서는 this 생략해도 되긴함 	
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}
