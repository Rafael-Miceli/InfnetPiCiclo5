package Service;

import Model.User;

import Repository.UserRepository;

public class UserService {
	
	private UserRepository _userRepository;

	public UserService() {
		//Poor Mans Dependency Injection
		_userRepository = new UserRepository();
	}
	
	public User login(String email, String password) {
		
		User user = _userRepository.getByEmail(email);
		
		if (user != null) {
			return user.getPassword().equals(password) ? user : null;
		}
		
		return null;
	}

}
