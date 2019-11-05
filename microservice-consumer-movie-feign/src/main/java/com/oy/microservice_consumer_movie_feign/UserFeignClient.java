package com.oy.microservice_consumer_movie_feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "microservice-provider-user")
public interface UserFeignClient {
	@GetMapping("/users/{id}")
	User findById(@PathVariable Long id);
}
