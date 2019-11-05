package com.oy.microservice_consumer_movie_feign;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	private Long id;
	private String username;
	private String name;
	private Integer age;
	private BigDecimal balance;

}
