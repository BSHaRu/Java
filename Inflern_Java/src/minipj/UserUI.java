package minipj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class UserUI {
	private BufferedReader br;
	private String email;
	private String name;
	private String birth;
	
	public UserUI() {
		br = new BufferedReader(
				new InputStreamReader(System.in)); 
	}
	
	public int menu() {
		System.out.println("회원 정보 탭 입니다.");
		
		int menuId = -1;
		boolean isCheck = false;
		while(!isCheck) {
			try {
				System.out.println("1. 회원 등록 | 2. 회원 목록 보기 | 3. 회원 정보 수정 | 4. 회원 탈퇴 | 0. 종료");
				// 스캐너를 쓰면 Integer로 형변환 안하고
				// nextInt를 통해서 바로 정수값을 가져 올 수있지 않나?
				// 여기서 왜 br을 통해서 String으로 받는건가?
				String line = br.readLine();
				// 문자열을 정수로 변환
				menuId = Integer.parseInt(line);
				isCheck = true;
			} catch (IOException e) {
				System.out.println("menu : " + e.getMessage() );
			} catch(NumberFormatException e) {
				System.err.println("잘못 입력하셨습니다.");
//				System.out.println("menu의 numberFormat : " + e.getMessage());
			}
		}
		return menuId;
	}
	
	public User regUser() {
		
		try {
			b: while(true) {
				System.out.println("email을 입력하세요.");
				email = br.readLine();
				if(!email.contains("@")) {
					System.out.println("@를 포함해서 이메일 양식을 제대로 입력하세요");
					continue;
				} else {
					System.out.println("이름을 입력하세요");
					name = br.readLine();
					a: while(true) {
						System.out.println("생년월일을 6자리로 입력하세요(910101)");
						birth = br.readLine();
						
						if(birth.length() != 6) {
							System.out.println("6자리 양식대로 입력해주세요");
							continue a;
						}
						break b;
					}
				} // if end
			} // while end
		} catch (IOException e) {
			System.out.println("regUser() : " + e.getMessage());
			return null;
		} //try catch end
		User user = new User(email, name, birth);
		return user;
	} // regMenu() end
	
	
	public String modEmail() {
		System.out.println("수정할 회원의 email 정보를 입력해주세요");
		try {
			email = br.readLine();
		} catch (IOException e) {
			System.out.println("modEmail : " + e.getMessage());
		}
		return email;
	}
	
	public User modify(String email) {
		try {
			System.out.println("이름을 입력하세요");
			name = br.readLine();
			while(true) {
				System.out.println("생년월일을 6자리로 입력하세요(910101)");
				birth = br.readLine();
				
				if(birth.length() != 6) {
					System.out.println("6자리 양식대로 입력해주세요");
					continue ;
				}
				break;
			}
		} catch (IOException e) {
			System.out.println("modify : " + e.getMessage());
		}
		User user = new User(email, name, birth);
		return user;
	}
	
	public void printUserList(Iterator<User> iter) {
		System.out.println("email      /    이름    /     생년월일    ");
		System.out.println("===================================");
		while(iter.hasNext()) {
			User user = iter.next();
			System.out.printf("%s     /   %s   /   %s    \n",
					user.getEmail(), user.getName(), user.getBirth());
					
		}
	}
	
	
}
