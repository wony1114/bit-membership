package user;

public class UserServiceImpl implements UserService {

	private UserDTO[] users;
	private int count;

	public UserServiceImpl() {
		users = new UserDTO[3];
		count = 0;
	}

	@Override
	public void signup(UserDTO user) {
		users[count] = user;
		count++;

	}

	@Override
	public UserDTO login(UserDTO user) {
		UserDTO result = null;
		for (int i = 0; i < count; i++) {
			if (user.getUserid().equals(users[i].getUserid()) && user.getPassword().equals(users[i].getPassword())) {
				result = users[i];
				break;
			}
		}

		return result;
	}

	@Override
	public void update(UserDTO user) {
		for (int i = 0; i < count; i++) {
			if (user.getUserid().equals(users[i].getUserid())) {
				users[i].setPassword(user.getPassword());
				break;
			}
		}

	}

	@Override
	public void deleteUser(UserDTO user) {
		for (int i = 0; i < count; i++) {
			if (user.getUserid().equals(users[i].getUserid()) && user.getPassword().equals(users[i].getPassword()));
			users[i] = users[count - 1];
			users[count - 1] = null;
			count--;
			break;
		}

	}

	@Override
	public boolean checkId(String id) {
		boolean flag = false;
		for (int i = 0; i < count; i++) {
			if (id.equals(users[i].getUserid())) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	@Override
	public UserDTO mypage(UserDTO user) {
		UserDTO result = new UserDTO();
		for (int i = 0; i < count; i++) {
			if(user.getUserid().equals(users[i].getUserid())) {
				result = users[i];
				break;
			}
		}
		return null;
	}

	@Override
	public UserDTO[] list() {
		
		return users;
	}

	@Override
	public UserDTO idSearch(String id) {
		UserDTO user = new UserDTO();
		for (int i = 0; i < count; i++) {
			if(id.equals(users[i].getUserid())) {
				user= users[i];
			}
		}
		return user;
	}
	@Override
	public int countSameName(String name) {
		int num = 0;
		for(int i = 0; i < count; i++ ) {
			if(name.equals(users[i].getName())) {
				num++;
			}
		}
		return num;
	}
	

	@Override
	public UserDTO[] nameSearch(String name) {
		int num = countSameName(name);
		UserDTO[] usersWitnSameName = new UserDTO[num];
		int j = 0;
		for (int i = 0; i < count; i++) {
			if(name.equals(users[i].getName())) {
				usersWitnSameName[j] = users[i]; 
				j++;
				if(j==num) {
					break;
				}
			}
		}
		return usersWitnSameName;
	}

	@Override
	public int count() {

		return count;
	}

}
