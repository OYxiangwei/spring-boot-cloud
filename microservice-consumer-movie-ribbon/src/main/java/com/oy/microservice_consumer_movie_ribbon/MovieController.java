package com.oy.microservice_consumer_movie_ribbon;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/movies")
public class MovieController {
	@Autowired
	RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "findByIdFallback")
	@RequestMapping("/users/{id}")
	public User findById(@PathVariable Long id) {
		User user = restTemplate.getForObject("http://microservice-provider-user/users/{id}", User.class, id);
		return user;
	}

	public User findByIdFallback(Long id) {
		return new User(id, "default username", "default name", 0, new BigDecimal(1));
	}

}
