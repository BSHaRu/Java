package test7;

class Person{
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void Hello() {
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
	}
}

class Student extends Person{
	
	private int num2;
	
	public Student(String name, int age, int num2) {
		super(name, age);
		this.num2 = num2;
	}
	
	public void Hello() {
		super.Hello();
		System.out.println("학번 : " + this.num2);
	}
}

class Worker extends Person{
	
	private int num3;

	public Worker(String name, int age, int num3) {
		super(name, age);
		this.num3 = num3;
	}
	
	public void Hello() {
		super.Hello();
		System.out.println("사번 : " + this.num3);
	}
}

public class Test04 {

	public static void main(String[] args) {
		Student kim = new Student("김유신", 21, 20201234);
		Worker lee = new Worker("이순신", 35, 20211201);
		
		kim.Hello();
		lee.Hello();
	}
}
