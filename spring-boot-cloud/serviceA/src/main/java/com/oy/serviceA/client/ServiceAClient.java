package com.oy.serviceA.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "serviceB", fallback = ServiceAClient.serviceAClientFallback.class)
public interface ServiceAClient {
	@GetMapping("/")
	String printServiceA();

	@Component
	class serviceAClientFallback implements ServiceAClient {

		private static final Logger LOGGER = LoggerFactory.getLogger(serviceAClientFallback.class);

		@Override
		public String printServiceA() {
			LOGGER.info("异常发生，进入fallback方法");
			return "SERVICE B FAILED - FALLING BACK";
		}

	}

}
