package constructor;

/*
 * 불변 객체 : getter만 있고 setter만 있는 객체
 * 	-> getter로 값을 받아 올 수는 있지만,
 * 	setter가 없기 때문에 해당 값을 절대로 수정할 수가 없다.
 * 	 
 */

public class User {
	private String email;
	private String password;
	private String name;
	
	// 생성자를 하나라도 만들게 되면 기본생성자가 자동으로 안만들어짐
	public User(String email, String name) {
//		this.email = email;
//		this.name = name;
		// this 생성자는 super()생성자를 제외하고 맨 첫줄에 있어야함
//		System.out.println("어서오세요"); // 이러면 오류남
		this(email, null, name); // 이렇게 해도 가능
	}

	// 생성자 오버로딩
	public User(String email, String password, String name) {
		this.email = email;
		this.password = password;
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", "
				+ "name=" + name + "]";
	}
	
	
	
	
}
