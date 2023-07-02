package minipj;

import java.util.Iterator;

public interface UserService {
	// 회원 정보 등록
	public void addUser(User user);
	
	// 회원 목록 보기
	public Iterator<User> getUsers();
	
	// 회원 정보 수정 
	// -> user.getEmail()에 해당하는 회원정보 수정
	public boolean updateUser(User user);
	
	// 회원 정보 삭제
	public boolean deleteUser(String email);
	
	// email 있는지 없는지 확인
	public boolean exists(String email);
}
