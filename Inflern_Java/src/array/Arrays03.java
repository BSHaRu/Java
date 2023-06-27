package array;

import java.util.Arrays;
import java.util.Comparator;


// Comparable : 어떤 Item이 큰지, 작은지 기준을 정하는 interface
class Item implements Comparable{
	private String name;
	private int price;
	
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// toString()을 재정의 해줘야 println()로 값을 출력할 수 있음
	@Override
	public String toString() {
		return "Item [name=" + name + 
				", price=" + price + "]";
	}

	// compareTo() : 파라미터로 들어온 Object와 내 자신을 비교하는 메서드
	// -> Object를 받아들이도록 했지만, 여기선 다운캐스팅해서 Item이 들어옴
	// => 글자 순으로 비교
//	@Override
//	public int compareTo(Object o) {
//		Item a = (Item) o;
//		// 앞글자부터 유니코드 순서대로 비교를 함
//		return this.name.compareTo(a.name);
//	}
	// 가격 순으로 비교
	@Override
	public int compareTo(Object o) {
		Item a = (Item) o;
		return this.price - a.price;
	}
}

// Arrays.sort(itmes, new ItemSorter()); 쓸라면 이게 필요함
// Interface Comparator<T>
//  : 메소드가 1개뿐이라서 람다식으로도 정의가 가능하다.
// -> o1이랑 o2를 전체적으로 비교를 해줌
// 어떻게? => return을 통해서 정해주는거임
// -> Arrays.sort로 정렬이 가능함
class ItemSorter implements Comparator{

	// o1 - o2를 해서 양수 / 0 / 음수값으로 비교해줌
	// Returns:
//	the value 0 if x == y; 
//	a value less than 0 if x < y; 
//	and a value greater than 0 if x > y
	@Override
	public int compare(Object o1, Object o2) {
		Item item1 = (Item) o1;
		Item item2 = (Item) o2;
		// item1이랑 item2의 이름을 비교
		// -> Arrays.sort(itmes, new ItemSorter())하면 
		// 이름기준으로 오름차순해서 정렬해줌(정렬은 sort가 정렬해줌)
		return item1.getName().compareTo(item2.getName());
	}
}

public class Arrays03 {

	public static void main(String[] args) {
		Item[] itmes = new Item[5];
		itmes[0] = new Item("java", 5000);
		itmes[1] = new Item("파이썬", 7500);
		itmes[2] = new Item("C++", 9000);
		itmes[3] = new Item("오라클", 3000);
		itmes[4] = new Item("JS", 4500);
		
		// sort(Object[]) : Object는 모든 객체의 조상
		// -> 어떤 객체의 배열이든 정렬이 가능
		Arrays.sort(itmes);
		// 이렇게 바로 하면 ClassCastException이 발생
		// => 정렬을 해야되는데 비교 대상이 뭔지 모르기 때문에 발생 
		// -> Item 클래스에서 Comparable를 implements 해줘야됨
		
//		Arrays.sort(itmes, new ItemSorter());
		
		for(Item i : itmes) {
			System.out.println(i);
		}
		
	}
}
