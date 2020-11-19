package user;

public interface UserService {
	public void signup(UserDTO user);
	public UserDTO login(UserDTO user);
	public void update(UserDTO user);
	public void deleteUser(UserDTO user);
	public boolean checkId(String id);
	public UserDTO mypage(UserDTO user);
	public UserDTO[] list();
	public UserDTO idSearch(String id);
	public UserDTO[] nameSearch(String name);
	public int count();
}
