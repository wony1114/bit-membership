package user;

public interface UserDAO {
	public void inserUser(UserDTO user);
	public UserDTO login(UserDTO user);
	public void updateUser(UserDTO user);
	public void deleteUser(UserDTO user);
	public boolean selectId(String id);
	public UserDTO selectUser(UserDTO user);
	public UserDTO[] selectUserList();
	public UserDTO selectById(String id);
	public UserDTO[] selectByName(String name);
	public int selectCount();
}
