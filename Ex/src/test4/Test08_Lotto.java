package test4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * 날짜 : 2023.06.30
 * 내용 : 로또번호 연습문제
 */

public class Test08_Lotto {

	public static void main(String[] args) {
		for(int count = 1; count <= 5; count++) {
			System.out.println(makeLott());
		}
	}

	private static Set<Integer> makeLott() {
		Set<Integer> lottoSet = new HashSet<>();
		
		// for(;;) : while(true)랑 같은거
		for(;;) {
				// == (int) Math.ceil(Math.random() * 45)
			int num = (int) (Math.random()*45)+1;
			
			lottoSet.add(num);
			
			if(lottoSet.size() == 6) break;
		}
		
		// 정렬
		Set<Integer> treeSet = new TreeSet<>(lottoSet);
		
		return treeSet;
	}
}
