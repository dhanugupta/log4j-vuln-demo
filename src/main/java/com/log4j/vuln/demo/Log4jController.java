package com.log4j.vuln.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
@RestController
public class Log4jController {

	private static final Logger logger = LogManager.getLogger(Log4jController.class);
	@GetMapping("/vuln")
	public String testVul(@RequestHeader("X-log4j") String log4jTest ) {
		logger.info("LOG4j HEADER {}", log4jTest);
		return "You might be vuln!!";
	}

}
