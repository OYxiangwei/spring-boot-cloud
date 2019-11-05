package com.oy.microservice_provider_user;

import java.math.BigDecimal;
import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Bean
	ApplicationRunner init(UserRepository repository) {
		return args -> {
			User user1 = new User(1L, "account1", "yxw", 20, new BigDecimal(100.00));
			User user2 = new User(2L, "account2", "oy", 28, new BigDecimal(180.00));
			User user3 = new User(3L, "account3", "oyxw", 32, new BigDecimal(280.00));
			Stream.of(user1, user2, user3).forEach(repository::save);
		};
	}
}
