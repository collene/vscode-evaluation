package ca.redzed.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ca.redzed")
@EnableAutoConfiguration
@SpringBootApplication
public class DemoApplication {
	private static final Logger log = LogManager.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		log.info("Starting DemoApplication");
		SpringApplication.run(DemoApplication.class, args);
	}

}
