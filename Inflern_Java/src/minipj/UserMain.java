package minipj;

public class UserMain {
	
	public static void main(String[] args) {
		UserUI userUI = new UserUI();
		UserDAO userDao = new UserDAO("C:\\Windows\\Temp\\users.txt");
		// 메모리상에 있는 User정보 관리
//		List<User> users = userDao.getUser(); 
		UserService userService 
			= new UserServiceInMemory(userDao.getUser());
		
		while(true) {
			int menuId = userUI.menu();
			if(menuId == 0) {
				System.out.println("종료되었습니다.");
				userDao.saveUser(userService.getUsers());
				break;
			}else if(menuId == 1) {
				User user = userUI.regUser();
				userService.addUser(user);
				System.out.println("등록 되었습니다.");
			}else if(menuId == 2) {
				userUI.printUserList(userService.getUsers());
			}else if(menuId == 3) {
//				User user = userUI.modify(users);
//				users.add(user);
				String email = userUI.modEmail();
				boolean isFindEmail = userService.exists(email);
				
				if(isFindEmail) {
					User updateUser = userUI.modify(email);
					userService.updateUser(updateUser);
					System.out.println("수정 되었습니다.");
				}else {
					System.out.println("수정 할 회원 정보가 없습니다.");
				}
			}else if(menuId == 4) {
				String email = userUI.modEmail();
				boolean isFindEmail = userService.exists(email);
				
				if(isFindEmail) {
					userService.deleteUser(email);
					System.out.println("삭제 되었습니다.");
				}else {
					System.out.println("삭제 할 회원 정보가 없습니다.");
				}
				
			}else {
				System.err.println("다시 입력해 주세요");
				continue;
			}
		}
	}
	
}
