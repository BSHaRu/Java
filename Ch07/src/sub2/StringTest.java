package sub2;

/*
 * 날짜 : 2023.06.27
 * 내용 : Java String Class 실습
 */
public class StringTest {

	public static void main(String[] args) {
		
		// 문자열(문자 + 배열) 생성
		String str1 = "Hello"; 				// 암시적(리터럴)
		String str2 = new String("Hello"); // 명시적
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		
		System.out.println("--------------------");
		
		if(str1 == str2) {
			System.out.println("str1 == str2");
		}else {
			System.out.println("str1 != str2");
		}
		
		System.out.println("--------------------");
		
		if(str1.equals(str2)) {
			System.out.println("str1 == str2");
		}else {
			System.out.println("str1 != str2");
		}
		
		System.out.println("--------------------");
		
		// 문자열 길이
		String msg = "Hello Korea";
		System.out.println("msg 길이 : " + msg.length());
		
		// 문자열 추출
		System.out.println("msg 1번째 문자 : " + msg.charAt(0));
		System.out.println("msg 7번째 문자 : " + msg.charAt(6));
		
		// 문자열 자르기
		// substring(a,b) : a부터 b까지 잘라라
		// H~o까지 자름 => Hello
		String sub1 = msg.substring(0, 5); 
		// substring(a) : a이전까지 잘라서 버려라
		// -> H~ 공백까지 자름 => K부터 시작
		String sub2 = msg.substring(6); 
		System.out.println("sub1 : " + sub1);
		System.out.println("sub2 : " + sub2);
										
		// 문자열 인덱스
		// indexOf : return값은 int임
		// -> int로 받아줘야됨
		// => 앞에서부터 index 번호를 찾음
		int index1 = msg.indexOf("e");
		// lastIndexOf : 뒤에서부터 index 번호 찾음
		int index2 = msg.lastIndexOf("e");
		
		System.out.println("index1 : " + index1);
		System.out.println("index2 : " + index2);
		
		// 문자열 교체
		String rs1 = msg.replace("Korea", "Busan");
		String rs2 = msg.replace("Hello", "Welcome");
		
		System.out.println("rs1 : " +rs1);
		System.out.println("rs2 : " +rs2);
		
		System.out.println("--------------------");
		
		// 문자열 변환
		int		var1 = 1;
		double	var2 = 3.14;
		boolean	var3 = true;
		
		String s1 = String.valueOf(var1);
		String s2 = String.valueOf(var2);
		String s3 = "" + var3;
		
		System.out.println("s1 : " + s1 + 1);
		System.out.println("s2 : " + s2 + 1);
		System.out.println("s3 : " + s3 + 1);

	}
}
