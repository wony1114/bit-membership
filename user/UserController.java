package user;

public class UserController {
	private UserService userService;

	public UserController() {
		userService = new UserServiceImpl();

	}

	public void postSignup(UserDTO user) {
		userService.signup(user);
	}

	public UserDTO postLogin(UserDTO user) {
		return userService.login(user);
		
	}

	public void putUpdate(UserDTO user) {
		userService.update(user);
	}

	public void deleteUser(UserDTO user) {
		userService.deleteUser(user);
	}

	public boolean getCheckId(String id) {
		return userService.checkId(id);
	}

	public UserDTO getMypage(UserDTO user) {
		return userService.mypage(user);
	}

	public UserDTO[] getList() {
		return userService.list();
	}

	public UserDTO getIdSearch(String id) {
		return userService.idSearch(id);
	}

	public UserDTO[] getNameSearch(String name) {
		return userService.nameSearch(name);
	}

	public int getCount() {
		return userService.count();
	}
}
