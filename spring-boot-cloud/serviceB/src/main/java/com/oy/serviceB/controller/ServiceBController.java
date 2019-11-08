package com.oy.serviceB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ServiceBController {
	@Autowired
	EurekaDiscoveryClient eurekaDiscoveryClient;

	@Value("${msg:unknown}")
	private String msg;

	@GetMapping("/")
	public String printServiceB() throws Exception {
		ServiceInstance serviceInstance = eurekaDiscoveryClient.getLocalServiceInstance();
		return serviceInstance.getServiceId() + "(" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + ")"
				+ "--->msg:" + msg;

	}

}
