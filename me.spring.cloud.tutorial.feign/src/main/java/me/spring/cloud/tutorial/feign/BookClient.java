package me.spring.cloud.tutorial.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("book")
public interface BookClient {
	@RequestMapping(method = RequestMethod.GET, value = "/available")
	String getStores();

	@RequestMapping(method = RequestMethod.POST, value = "/checked-out")
	String update();
}