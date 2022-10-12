package com.springboot.app;


import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class SpringbootLogApplication {
	private static final Logger mylog = (Logger) LoggerFactory.getLogger(SpringbootLogApplication.class);

	public static void main(String[] args) {
		mylog.debug("This is a debug message");
		mylog.error("This is Error message");
		mylog.info("This is Info message");
		mylog.warn("This is a Warning message");
		mylog.trace("This is a trace message");
		SpringApplication.run(SpringbootLogApplication.class, args);
	}

}
