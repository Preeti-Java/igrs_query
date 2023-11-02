package com.cg.neel.igrs.query;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableEurekaClient
@EnableFeignClients 
@EnableJpaRepositories("com.cg.neel.igrs.*")
@ComponentScans(value = {
		@ComponentScan("com.cg.neel.igrs.*")
		})
@EntityScan("com.cg.neel.igrs.*") 
public class IgrsQueryApplication {

	public static void main(String[] args) {
		SpringApplication.run(IgrsQueryApplication.class, args);
	}

}
