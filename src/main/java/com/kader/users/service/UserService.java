package com.kader.users.service;

import com.kader.users.entities.Role;
import com.kader.users.entities.User;

public interface UserService {
	 User saveUser(User user); 
	 User findUserByUsername (String username); 
	 Role addRole(Role role); 
	 User addRoleToUser(String username, String rolename); 
}
