package me.wenchao.spring.cloud.tutorial.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * create by songwenchao　on 19-2-20
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(ConfigServiceApplication.class, args);
	}
}
