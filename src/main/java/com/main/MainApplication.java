package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan({"com.main","com.lab.industrial","com.quest.info","qis.Cashier","com.quest.controller","qis.Items","qis.Transaction"})
@EntityScan({"com.main","com.quest.info","com.lab.industrial","qis.Cashier","com.quest.controller","qis.Items","qis.Transaction"})
@EnableJpaRepositories({"com.main","com.quest.info","com.lab.industrial","qis.Cashier","com.quest.controller","qis.Items","qis.Transaction"})
@EnableAutoConfiguration
public class MainApplication {
	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
		
	}
	
}
