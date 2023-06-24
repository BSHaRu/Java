package constructor;

public class UserEx {

	public static void main(String[] args) {
		User user = new User("email : 이메일","name : 이름");
		
		System.out.println(user.getName());
		System.out.println(user.getEmail());
		System.out.println("user.toString() : " + user);
		
		System.out.println("-------------------");
		User user2 = new User("email : 이뭬일@점컴", "password : pw1234", "name : 이르으음");
		System.out.println(user2.getName());
		System.out.println(user2.getEmail());
		System.out.println(user2.getPassword());
		System.out.println("user2.toString() : " + user2);
		
	}
	
}
