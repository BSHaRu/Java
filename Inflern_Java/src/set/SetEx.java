package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {
		Set<MyData> mySet = new HashSet<>();
		mySet.add(new MyData("kim", 500));
		mySet.add(new MyData("lee", 200));
		mySet.add(new MyData("hong", 700));
		
		/*
		* Set은 중복 저장이 안되는데, 
		* print로 출력하면 중복 데이터가 나온다?
		* -> HashSet()에 저장될 때는 
		* 가장 먼저 equals()로 비교, 이후 hashCode() 비교
		* 최상위 객체인 Object값의 equals()와 hashCode()를 호출
		* => 이 Object의 equals()와 hashCode()는 아무런 쓸모없음
		* 	==> 그래서 Override로 재정의를 안하면
		* 		제대로 된 중복값을 확인 못함
		* ∴ Hash 라는 키워드가 나오면 
		* 	equals()와 hashCode()를 재정의 해주기!! 
		*/
		mySet.add(new MyData("hong", 700));
		
		Iterator<MyData> iterator = mySet.iterator();
		while(iterator.hasNext()) {
			MyData myData = iterator.next();
			System.out.println(myData);
		}
	}
}
