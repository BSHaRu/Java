package test5;

import java.util.Scanner;

/*
 * 날짜 : 2023.07.17
 * 내용 : 자바 총정리 연습문제
 */

public class Test07_BMI {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키(cm) 입력 : ");
		double height = sc.nextDouble();
		height /= 100;
		
		System.out.println("체중(kg) 입력 " );
		double weight = sc.nextDouble();
		double bmi =  weight / (height * height); 
		
		String result;
		if(bmi < 20)
			result = "저체중";
		else if (bmi < 25)
			result = "정상체중";
		else if (bmi < 30)
			result = "경도비만";
		else if (bmi < 40)
			result = "비만";
		else 
			result = "고도비만";
		
		System.out.printf("BMI=%.2f, '%s'입니다.", bmi, result);
		
		sc.close();
	}

}
