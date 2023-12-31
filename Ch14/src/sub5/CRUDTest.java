package sub5;

import java.util.List;
import java.util.Scanner;

/*
 * 날짜 : 2023.07.12
 * 내용 : CRUD 실습
 * 
 * CRUD 
 *  - Create, Read, Update, Delete 의미
 *  - 데이터베이스의 기본 처리 기능을 의미
 *  - Insert, Select, Update, Delete 처리 기능
 */
public class CRUDTest {

	public static void main(String[] args) {
		System.out.println("=========================");
		System.out.println("회원 관리 매니저 v1.0");
		System.out.println("=========================");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("종료: 0 | 추가: 1 | 조회: 2 | 검색: 3 | 수정: 4 | 삭제: 5");
			System.out.print("선택 : ");
			
			int num = sc.nextInt();
			
			if(num == 0) {
				break;
			}else if(num == 1) {
				UserVO vo = new UserVO();
				
				System.out.print("아이디 입력 : ");
				vo.setUid(sc.next());
				
				System.out.print("이름 입력 : ");
				vo.setName(sc.next());
				
				System.out.print("전화번호 입력 : ");
				vo.setHp(sc.next());
				
				System.out.print("나이 입력 : ");
				vo.setAge(sc.nextInt());
				
				UserDAO dao = UserDAO.getInstance();
				dao.insertUser(vo);
				System.out.println("insert 완료");
			} else if(num == 2) {
				// 조회
				List<UserVO> users 
					= UserDAO.getInstance().selectUsers();
				System.out.println("===========전체조회==========");
				for(UserVO user : users) {
					System.out.println(user);
				}
				System.out.println("---------------------------");
			} else if(num == 3) {
				// 검색
				System.out.print("아이디 검색 : ");
				String uid = sc.next();
				
				UserVO user 
					= UserDAO.getInstance().selectUser(uid);
				System.out.println("===========검색 결과==========");
				System.out.println(user);
				System.out.println("---------------------------");
			} else if(num == 4) {
				UserVO vo = new UserVO();
				
				System.out.print("수정 할 회원의 아이디를 입력하세요 : ");
				vo.setUid(sc.next());
				
				System.out.print("수정 회원 이름 입력 : ");
				vo.setName(sc.next());
				
				System.out.print("수정 회원 연락처 입력 : ");
				vo.setHp(sc.next());
				
				System.out.print("수정 회원 나이 입력 : ");
				vo.setAge(sc.nextInt());
				
				int result = UserDAO.getInstance().updateUser(vo);
				
				if(result > 0) System.out.println("수정 완료");
				else System.out.println("수정할 회원이 없습니다.");
				
				System.out.println("-------------------------------");
			} else if(num == 5) {
				UserVO vo = new UserVO();
				
				System.out.print("삭제 할 회원의 아이디를 입력하세요 : ");
				vo.setUid(sc.next());
				
				int result = UserDAO.getInstance().deleteUser(vo);
				
				if(result > 0) System.out.println("회원이 삭제 되었습니다.");
				else System.out.println("삭제할 회원이 없습니다.");
			} else {
				System.out.println("제대로 입력해 주세요");
				continue;
			}
		} // while end
		System.out.println("프로그램 종료");
		sc.close();
	} // main end
}
