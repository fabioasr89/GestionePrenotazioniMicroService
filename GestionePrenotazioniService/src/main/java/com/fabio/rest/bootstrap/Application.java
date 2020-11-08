package com.fabio.rest.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan({"com.fabio.rest.controller","com.fabio.rest.bean,com.fabio.rest.services"})
@EnableJpaRepositories(basePackages= {"com.fabio.rest.repository"})
@EntityScan(basePackages="com.fabio.rest.modelli")
@EnableAutoConfiguration
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
