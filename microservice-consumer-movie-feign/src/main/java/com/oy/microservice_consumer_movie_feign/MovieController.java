package com.oy.microservice_consumer_movie_feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController {
	@Autowired
	private UserFeignClient UserFeignClient;

	@GetMapping("/users/{id}")
	public User findById(@PathVariable Long id) {
		return this.UserFeignClient.findById(id);
	}
}
