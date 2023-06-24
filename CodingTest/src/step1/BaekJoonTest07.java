package step1;

import java.util.Scanner;

public class BaekJoonTest07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		String str2 = str1;

		if(str1 == str2) {
			String Id = str2+"??!"; 
			System.out.println(Id);
		}
		sc.close();
	}

}
