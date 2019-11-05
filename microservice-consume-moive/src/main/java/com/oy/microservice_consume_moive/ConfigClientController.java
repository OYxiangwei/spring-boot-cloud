package com.oy.microservice_consume_moive;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {
	@Value("${timeout:1}")
	private String timeout;

	@Value("${key1:22}")
	private String key1;

	@GetMapping("/configs")
	public String configs() {
		return toString();
	}

	@Override
	public String toString() {

		return "ConfigClientController{" + "timeout='" + timeout + '\'' + ", key1='" + key1 + '\'' + '}';
	}

}
