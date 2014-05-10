package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Role;
import Model.User;

public class UserRepository {

	private List<User> _users;	

	public UserRepository() {
		
		List<Role> roles = new RoleRepository().getAll();		
		
		User admin = new User();
		admin.setEmail("rafael");
		admin.setName("Rafael");
		admin.setPassword("123");
		admin.setRole(roles.get(0));
		
		User provider = new User();
		provider.setEmail("bagulho");
		provider.setName("Bagulho");
		provider.setRole(roles.get(1));
		provider.setPassword("321");
		
		_users = new ArrayList<User>();
		_users.add(admin);
		_users.add(provider);
	}
	
	public User getByEmail(String email) {
		for (User user : _users) {
			if (user.getEmail().equals(email))
				return user;
		}		
		return null;	
	}
}
