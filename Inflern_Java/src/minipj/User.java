package minipj;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private String email;
	private String name;
	private String birth;
	
	public User(String email, String name, String birth) {
		super();
		this.email = email;
		this.name = name;
		this.birth = birth;
	}

	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	public String getBirth() {
		return birth;
	}

	@Override
	public String toString() {
		return "User [email=" + email + 
				", name=" + name + 
				", birth=" + birth + "]";
	}
}
