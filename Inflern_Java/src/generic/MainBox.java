package generic;

public class MainBox {

	public static void main(String[] args) {
		ObjectBox box = new ObjectBox();
		box.set("kim");
		// Object -> String으로 형변환
		String str1 = (String) box.get();
		System.out.println(str1.toUpperCase());
		
		// 9버전부터는 new Integer(5)로 쓰지말고 그냥 5로써도 된다.
		box.set(new Integer(5));
		Integer i = (Integer) box.get();
		System.out.println(i.intValue());
		
		/*
		-> Object로 받고 넘기면 해당 타입에 맞게 
			형변환을 다시 해줘야된다.
			=> 그래서 등장한게 Generic임
		*/
		
		System.out.println("========================");
		
		GenericBox<String> genericBox = new GenericBox<>();
		genericBox.set("kim");
		String str2 = genericBox.get();
		System.out.println(str2.toUpperCase());
		
		GenericBox<Integer> intBox = new GenericBox<>();
		intBox.set(5);
		Integer intValue = intBox.get();
		System.out.println(intValue);
		
		GenericBox<Object> objBox = new GenericBox<>();
		objBox.set("제네릭을 obj로 잡으면 형변환 해줘야됨");
		String str3 = (String) objBox.get();
		System.out.println(str3);
		
	}

}
