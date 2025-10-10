package com.kader.users.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kader.users.entities.User;
import com.kader.users.repos.UserRepository;
import com.kader.users.service.UserService;
import com.kader.users.service.register.RegistrationRequest;

@RestController
@CrossOrigin(origins = "*")
public class UserRESTController {
	
	@Autowired
	UserRepository userRep;

    
    UserService userService;
    @GetMapping("all")
    public List<User> getAllUsers() {
        return userRep.findAll();
    }
    
    @PostMapping("/register") 
    public User register(@RequestBody RegistrationRequest request) {
    		return userService.registerUser(request); 
    } 
}
