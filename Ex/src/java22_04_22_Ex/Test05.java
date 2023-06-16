package java22_04_22_Ex;

import java.util.Scanner;

// 0 : 빈자리 , 1 : 예약좌석
public class Test05 {

	public static void main(String[] args) {
		final int size =10;
		int[] seats = new int[size];
		
		while(true) {
			System.out.println("--------------------");
			for(int i=0; i <size; i++) {
				System.out.print(i+1 + " ");
			}
			System.out.println("\n--------------------");
			for(int i=0; i<size; i++) {
				System.out.print(seats[i] + " ");
			}
			System.out.println("\n--------------------");
			
			System.out.println("원하시는 좌석번호를 입력하시오(종료-1) : ");
			
			Scanner sc = new Scanner(System.in);
			int s = sc.nextInt();
			
			if(s == -1) {
				System.out.println("종료되었습니다.");
				sc.close();
				break;
			}else if(s <= size) {
				if(seats[s-1] == 0 ) {
					seats[s-1] = 1;
					System.out.println("예약되었습니다.");
				}else {
					System.out.println("이미 예약된 자리입니다.");
				}
				continue;
			}else {
				System.out.println("해당번호는 없습니다.");
				continue;
			}
			
		} // while end
		
	} // main end
}
