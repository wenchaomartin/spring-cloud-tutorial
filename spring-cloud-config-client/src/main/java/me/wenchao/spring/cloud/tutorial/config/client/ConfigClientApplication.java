package me.wenchao.spring.cloud.tutorial.config.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by songwenchao　on 19-2-20
 */
@Configuration
@EnableAutoConfiguration
public class ConfigClientApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(ConfigClientApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

	@RestController
	@RefreshScope
	class MessageRestController {
		@Value("${info.foo}")
		private String message;

		@RequestMapping("/message")
		String getMessage() {
			return message;
		}

	}

	@Bean
	public CommandLineRunner printProperties(@Value("${info.foo}") final String fooProperty)  {
		return args -> LOGGER.info("info.foo is: [{}]", fooProperty);
	}
}
