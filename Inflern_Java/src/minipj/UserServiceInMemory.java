package minipj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// 메모리상에 User정보를 관리하는 클래스
public class UserServiceInMemory implements UserService {
	private List<User> users;
	
	public UserServiceInMemory() {
		this.users = new ArrayList<>();
	}
	
	public UserServiceInMemory(List<User> users) {
		this.users = users;
	}

	@Override
	public void addUser(User user) {
		users.add(user);
	}

	// 필드 users정보를 그대로 return 할 것인가?
	// -> 외부에서 List를 조작 할 수 있음
	// -> 외부에서 삭제가 가능
	// 읽기 전용인 Iterator로 하면 외부 수정을 못한다
	// -> 내부에서만 수정 가능
	@Override
	public Iterator<User> getUsers() {
		return users.iterator();
	}

	@Override
	public boolean updateUser(User user) {
		boolean deleteFalg = deleteUser(user.getEmail());
		
		if(deleteFalg) {
			users.add(user);
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public boolean deleteUser(String email) {
		int findIndex = findIndex(email);
		
		if(findIndex > -1) {
			users.remove(findIndex);
			return true;
		}else {
			return false;
		}
		
	}// delete end

	// email이 있으면 true, 없으면 false
	public boolean exists(String email) {
		if(findIndex(email) >= 0) {
			return true;
		}else {
			return false;
		}
	}
	
	// email이 있으면 0보다 큰 값을 반환
	public int findIndex (String email) {
		int findIndex = -1;
		for(int i = 0; i < users.size(); i++) {
			if(users.get(i).getEmail().equals(email)) {
				findIndex = i;
				break;
			}
		} // for end
		
		return findIndex;
	}

}
