package com.oy.serviceA.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oy.serviceA.client.ServiceAClient;

@RefreshScope
@RestController
public class ServiceAController {
	@Value("${name:unknown}")
	private String name;

	@Autowired
	EurekaDiscoveryClient discoveryClient;
	@Autowired
	private ServiceAClient serviceAClient;

	@GetMapping("/")
	public String printServiceA() {
		ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
		return serviceInstance.getServiceId() + "(" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + ")"
				+ "--->name:" + name + "</br>" + serviceAClient.printServiceA();
	}

	@GetMapping(path = "/current")
	public Principal getCurrentAccount(Principal principal) {
		return principal;
	}
}
