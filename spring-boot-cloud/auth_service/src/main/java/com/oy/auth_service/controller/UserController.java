package com.oy.auth_service.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {
	@GetMapping("/current")
	public Principal getUser(Principal principal) {
		return principal;
	}

}
