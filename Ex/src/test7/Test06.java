package test7;

class _Person{
	private String name;
	private int age;
	public _Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void Hello() {
		System.out.println("---------------");
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
	}
}

class _Student extends _Person{

	private String school;
	private String mager;
	public _Student(String name, int age, String school, String mager) {
		super(name, age);
		this.school = school;
		this.mager = mager;
	}

	public void Hello() {
		super.Hello();
		System.out.println("학교 : " + this.school);
		System.out.println("전공 : " + this.mager);
	}
}

class _SalaryStudent extends _Student{
	private String company;

	public _SalaryStudent(String name, int age, String school, String mager, String company) {
		super(name, age, school, mager);
		this.company = company;
	}
	
	public void Hello(){
		super.Hello();
		System.out.println("회사 : " + this.company);
	}
}

public class Test06 {

	public static void main(String[] args) {
		_Person kim = new _Person("김유신", 24);
		_Student jang = new _Student("장보고", 26, "부경대", "영문학과");
		_SalaryStudent lee = new _SalaryStudent("이순신", 27, "부산대", "경제학과", "삼성전자");
		
		kim.Hello();
		jang.Hello();
		lee.Hello();
	}

}
