package array;

public class ArrayEx {

	public static void main(String[] args) {
		
		ItemForArray[] array1;
		
		// 이 때 ItemForArray 인스턴스가 생기는게 아니라
		// 해당 배열만 생기는거임(참조 값이 없음) 
		// -> array1이 5개의 배열을 가지고 있는데
		// 이 값들은 그냥 모두 null인거임
		array1 = new ItemForArray[5];
		
		// 이렇게 값이 들어가야 ItemForArray의 인스턴스가 생기는거임
		// -> 이제서야 array1이 ItemForArray를 참조하는데
		// array1의 배열크기는 5개니깐 index값이 없는곳은 나머지 공간은 null;
		array1[0] = new ItemForArray(500, "item01");
		array1[1] = new ItemForArray(1000, "item02");
		
		ItemForArray i1 = new ItemForArray(500, "itemAAA");
		
		System.out.println(array1[0].getName());
		System.out.println(i1.getName());
		
		// array1[2]는 해당값이 없기때문에 NullPointerException이 뜸
//		System.out.println(array1[2].getName());
		
	}

}
