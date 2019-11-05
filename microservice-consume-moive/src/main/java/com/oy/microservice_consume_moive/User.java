package com.oy.microservice_consume_moive;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	private Long id;
	private String userName;
	private String name;
	private Integer age;
	private BigDecimal balance;

}
