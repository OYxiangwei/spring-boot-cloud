package com.oy.microservice_consume_moive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/movies")
public class MovieController {
	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/users/{id}")
	public User findById(@PathVariable Long id) {
		User user = restTemplate.getForObject("http://localhost:8000/users/{id}", User.class, id);
		return user;
	}

}
