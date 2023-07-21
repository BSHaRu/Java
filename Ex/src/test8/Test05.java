package test8;

import java.util.HashMap;
import java.util.Map;


class Person{
	private String id;
	private String name;
	private int age;

	public Person(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "아이디 : " + id + 
				", 이름 : " + name + 
				", 나이 : " + age;
	}
}

class PersonMap{
	private Map<String,Person> persons = new HashMap<>();
	
	public void addPerson(Person p) {
		// key : Person의 id값 | value : Person
		// -> Map <String, Person>으로 받는거다.
		persons.put(p.getId(), p);
	}
	
	// key 값으로 remove 처리
	public boolean reomovePerson(String uid) {
		// containsKey : 해당 key가 map에 존재하는지 여부 확인
		if(persons.containsKey(uid)) {
			persons.remove(uid);
			return true;
		}
		System.out.printf("아이디 '%s'가 존재하지 않습니다.\n", uid);
		return false;
	}
	
	public void showAllPersons() {
		for(Person p : persons.values()) {
			System.out.println(p);
		}
	}
}

public class Test05 {

	public static void main(String[] args) {
		
		PersonMap map = new PersonMap();
		
		Person p1 = new Person("a101", "김유신", 21);
		Person p2 = new Person("a102", "홍길동", 22);
		Person p3 = new Person("a103", "고길동", 23);
		Person p4 = new Person("a104", "김둘리", 24);
		Person p5 = new Person("a105", "강또치", 25);
		
		map.addPerson(p1);
		map.addPerson(p2);
		map.addPerson(p3);
		map.addPerson(p4);
		map.addPerson(p5);
		
		map.reomovePerson("홍길동");
		map.reomovePerson("a104");
		
		map.showAllPersons();
	}
}
