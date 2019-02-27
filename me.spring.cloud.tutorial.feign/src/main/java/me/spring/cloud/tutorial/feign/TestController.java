package me.spring.cloud.tutorial.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by songwenchao　on 19-2-27
 */
@RestController
public class TestController {
	@Autowired
	BookClient bookClient;

	@GetMapping(value = "/bookStatus")
	public String getBookStatus() {
		return bookClient.getStores();
	}
}
