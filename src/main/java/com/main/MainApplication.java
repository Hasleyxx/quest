package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



@SpringBootApplication
@ComponentScan({"com.main","com.lab.industrial","com.quest.info","qis.Cashier","com.quest.controller","qis.Items","qis.Transaction","qis.Company"})
@EntityScan({"com.main","com.quest.info","com.lab.industrial","qis.Cashier","com.quest.controller","qis.Items","qis.Transaction","qis.Company"})
@EnableJpaRepositories({"com.main","com.quest.info","com.lab.industrial","qis.Cashier","com.quest.controller","qis.Items","qis.Transaction","qis.Company"})
@EnableAutoConfiguration
@EnableWebMvc
public class MainApplication implements WebMvcConfigurer {
	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
		
	}
	@Override
     public void addCorsMappings(CorsRegistry registry) {
         registry.addMapping("/**").allowedOrigins("http://localhost:4200");
     }
	
}
