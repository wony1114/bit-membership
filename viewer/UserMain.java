package viewer;

import java.util.Scanner;

import user.UserController;
import user.UserDTO;

public class UserMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UserController userController = new UserController();
		UserDTO user = null;
		while (true) {
			System.out.println("1. 회원가입 2. 로그인 3. 비밀번호수정 4. 회원탈퇴 5. 아이디 중복체크 "
					+ "6. 마이페이지 7. 회원목록 8. 아이디검색 9. 이름검색 10. 전체 회원수 0. 종료");
			switch (scanner.next()) {
			case "1":
				System.out.println("회원가입 : 아이디, 비밀번호, 이름 입력");
				user = new UserDTO();
				user.setUserid(scanner.next());
				user.setPassword(scanner.next());
				user.setName(scanner.next());
				userController.postSignup(user);
				break;
			case "2":
				System.out.println("로그인 : 아이디, 비밀번호 입력");
				user = new UserDTO();
				user.setUserid(scanner.next());
				user.setPassword(scanner.next());
				UserDTO loginUser = userController.postLogin(user);
				if(loginUser == null) {
					System.out.println("로그인 실패");
				}else {
					System.out.println(loginUser.toString());	
				}
				break;
			case "3":
				System.out.println("비밀번호수정 : 아이디, 변경할 비밀번호 입력");
				user.setUserid(scanner.next());
				user.setPassword(scanner.next());
				userController.putUpdate(user);
				break;
			case "4":
				System.out.println("회원탈퇴 : 아이디, 비밀번호 입력");
				user.setUserid(scanner.next());
				user.setPassword(scanner.next());
				userController.deleteUser(user);
				break;
			case "5":
				System.out.println("아이디 중복체크 : 아이디 입력");
				boolean exist = userController.getCheckId(scanner.next());
				if(exist) {
					System.out.println("사용 가능한 아이디입니다.");
				}else {
					System.out.println("사용 불가능한 아이디입니다.");
				}
				
				break;
			case "6":
				System.out.println("아이디, 비밀번호 입력");
				user.setUserid(scanner.next());
				user.setPassword(scanner.next());
				UserDTO mypage = userController.getMypage(user);
				System.out.println(user);
				break;
			case "7":
				UserDTO[] list = userController.getList();
				for(int i = 0; i < userController.getCount(); i++) {
					System.out.println(list[i].toString()+"\n");
				}
				break;
			case "8":
				System.out.println("아이디 입력");
				UserDTO idSearch = userController.getIdSearch(scanner.next());
				System.out.println(idSearch);
				break;
			case "9":
				System.out.println("이름 입력");
				String name = scanner.next();
				UserDTO[] nameSearch = userController.getNameSearch(scanner.next());
				for(int i = 0; i < userController.getCountSameName(name); i++) {
					System.out.println(nameSearch[i].toString()+"\n");
				}
				
				break;
			case "10":
				
				System.out.printf("전체회원수 : %d명\n", userController.getCount());
				break;
			case "0":
				System.out.println("시스템 종료");
				return;
			
			}
		}
	}
}
