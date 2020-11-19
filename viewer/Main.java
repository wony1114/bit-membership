package viewer;

import java.util.Scanner;

import user.UserController;
import user.UserDTO;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UserController userController = new UserController();
		UserDTO user = new UserDTO();
		while (true) {
			System.out.println("1. 회원가입 2. 로그인 3. 비밀번호수정 4. 회원탈퇴 5. 아이디 중복체크 "
					+ "6. 마이페이지 7. 회원목록 8. 아이디검색 9. 이름검색 10. 전체 회원수 0. 종료");
			switch (scanner.next()) {
			case "1":
				System.out.println("아이디, 비밀번호, 이름 입력");
				user.setUserid(scanner.next());
				user.setPassword(scanner.next());
				user.setName(scanner.next());
				userController.postSignup(user);
				break;
			case "2":
				System.out.println("아이디, 비밀번호 입력");
				user.setUserid(scanner.next());
				user.setPassword(scanner.next());
				userController.postLogin(user);
				break;
			case "3":
				System.out.println("아이디, 변경할 비밀번호 입력");
				user.setUserid(scanner.next());
				user.setPassword(scanner.next());
				userController.putUpdate(user);
				break;
			case "4":
				System.out.println("아이디, 비밀번호 입력");
				user.setUserid(scanner.next());
				user.setPassword(scanner.next());
				userController.deleteUser(user);
				break;
			case "5":
				System.out.println("아이디 입력");
				boolean exist = userController.getCheckId(scanner.next());
				break;
			case "6":
				System.out.println("아이디, 비밀번호 입력");
				user.setUserid(scanner.next());
				user.setPassword(scanner.next());
				UserDTO mypage = userController.getMypage(user);
				break;
			case "7":
				UserDTO[] list = userController.getList();
				break;
			case "8":
				System.out.println("아이디 입력");
				UserDTO idSearch = userController.getIdSearch(scanner.next());
				break;
			case "9":
				System.out.println("이름 입력");
				UserDTO[] nameSearch = userController.getNameSearch(scanner.next());
				break;
			case "10":
				int count = userController.getCount();
				break;
			case "0":
				System.out.println("시스템 종료");
				return;
			
			}
		}
	}
}
