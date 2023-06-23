package test3;

/*
 * 날짜 : 2023.06.23
 * 내용 : 정적 변수 연습문제
 */

class Student{
	public static int studentId;
	private String studentName;
	private String major;
	private int grade;
	
	public Student(String studentName, String major, int grade) {
		this.studentId++;
		this.studentName = studentName;
		this.major = major;
		this.grade = grade;
	}
	
	public void studentInfo() {
		System.out.println("===============");
		System.out.println("학번 : " + studentId);
		System.out.println("이름 : " + studentName);
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + grade);
		System.out.println("---------------");
	}
}

public class Test04 {

	public static void main(String[] args) {
		// 클래스타입으로 직접 참조 하기때문에 studentId는 static인걸 알 수 있다.
		Student.studentId = 20201000;
		
		Student kim = new Student("김유신", "국문과", 1);
		kim.studentInfo();

		Student lee = new Student("이순신", "경제학과", 1);
		lee.studentInfo();
		
		Student lim = new Student("임꺽정", "경영학", 1);
		lim.studentInfo();
	}
}
