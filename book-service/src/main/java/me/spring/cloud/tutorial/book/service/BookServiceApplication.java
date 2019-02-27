package me.spring.cloud.tutorial.book.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by songwenchao　on 19-2-27
 */
@SpringBootApplication
@EnableEurekaClient
public class BookServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(BookServiceApplication.class, args);
	}

	@RestController
	class BookController {
		@RequestMapping(	value = "/available")
		public String available() {
			return "Spring in Action";
		}

		@RequestMapping(value = "/checked-out")
		public String checkedOut() {
			return "Spring Boot in Action";
		}

	}
}
