package sub1;

import java.util.Objects;

public class Apple {

	private String contry; // 원산지
	private int price;

	public Apple(String contry, int price) {
		this.contry = contry;
		this.price = price;
	}

	@Override
	public String toString() {
		System.out.println("hashCode : " + hashCode());
		System.out.println("원산지 : " +this.contry);
		System.out.println("가격 : " + this.price);
		return super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apple other = (Apple) obj;
		return Objects.equals(contry, other.contry) 
				&& price == other.price;
	}
	
}
