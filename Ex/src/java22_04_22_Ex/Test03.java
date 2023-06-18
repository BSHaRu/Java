package java22_04_22_Ex;

// 최소값 구하기
public class Test03 {

	public static void main(String[] args) {
		
		int s[] = {12, 3, 19, 6, 18, 8, 12, 4, 1, 19 };
		int min = s[0];
		
		for(int i : s) {
			if(i < min) {
				min = i;
			}
		}
		System.out.println("최소값은 " + min);
	}
}
