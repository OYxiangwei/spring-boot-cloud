package com.oy.microservice_provider_user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/users")
@RestController
public class UserController {
	@Autowired
	UserRepository userRepository;

	@RequestMapping("/{id}")
	public Optional<User> findById(@PathVariable Long id) {
		return this.userRepository.findById(id);
	}

}
