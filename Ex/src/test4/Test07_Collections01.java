package test4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * 날짜 : 2023.06.30
 * 내용 : 리스트 연습문제
 */

public class Test07_Collections01 {

	public static void main(String[] args) {
		// 60 ~ 100 사이 임의의 수 10개를 더해서 결과값이 항상 다름
		printlist(createlist());
//		createlist();
	}

	private static void printlist(List<Integer> scoreList) {
		int total = 0;
		int size = scoreList.size();
		
		for(int i = 0; i < size; i++) {
			int score = scoreList.get(i);
			total += score;
			
			System.out.print(score);
			
			if(i == size -1 ) {
				System.out.print(" = ");
			}else {
				System.out.print(" + ");
			}
		} // for end
		System.out.println(total);
		
	} // printlist end

	private static List<Integer> createlist() {
		List<Integer> scoreList = new ArrayList<>();
		Random rand = new Random();
		
		for(int i=1; i<=10; i++) {
			// 60 ~ 100사이 임의의 수
			// nexInt(41) : 1~40까지의 임의의 정수
			// -> +60을 하게되면 60~100 임의의 정수가 되는거임 
			int num = rand.nextInt(41) + 60;
			
			scoreList.add(num);
//			scoreList.get(num);
//			System.out.println(scoreList.get(num));
		}
		return scoreList;
	} // createlist end
}
