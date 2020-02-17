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
@ComponentScan({"com.main","qis.Cashier","qis.Items","qis.Transaction",
	"qis.Company","qis.Industrial","qis.Microscopy","qis.Chemistry","qis.Serology","qis.Hematology",
	"qis.Toxicology","qis.Pe","qis.Patient","qis.Classification","qis.Personnel", "qis.Users","qis.Xray", 
	"qis.Accounting","qis.MarkerOption","qis.DoctorClearance","qis.DoctorMed","qis.DoctorMedcert","qis.DoctorPatient",
	"qis.DoctorRequest","qis.Email", "qis.DoctorPE", "qis.DoctorItems", "qis.DoctorRequestCategory", "qis.DoctorRequestOption",
	"qis.Passwords"})

@EntityScan({"com.main","qis.Cashier","qis.Items","qis.Transaction",
	"qis.Company","qis.Industrial","qis.Microscopy","qis.Chemistry","qis.Serology","qis.Hematology",
	"qis.Toxicology","qis.Pe","qis.Patient","qis.Classification","qis.Personnel", "qis.Users","qis.Xray",
	"qis.Accounting","qis.MarkerOption","qis.DoctorClearance","qis.DoctorMed","qis.DoctorMedcert","qis.DoctorPatient",
	"qis.DoctorRequest","qis.Email", "qis.DoctorPE", "qis.DoctorItems", "qis.DoctorRequestCategory", "qis.DoctorRequestOption",
	"qis.Passwords"})

@EnableJpaRepositories({"com.main","qis.Cashier","qis.Items","qis.Transaction",
	"qis.Company","qis.Industrial","qis.Microscopy","qis.Chemistry","qis.Serology","qis.Hematology",
	"qis.Toxicology","qis.Pe","qis.Patient","qis.Classification","qis.Personnel", "qis.Users","qis.Xray",
	"qis.Accounting","qis.MarkerOption","qis.DoctorClearance","qis.DoctorMed","qis.DoctorMedcert","qis.DoctorPatient",
	"qis.DoctorRequest","qis.Email", "qis.DoctorPE", "qis.DoctorItems", "qis.DoctorRequestCategory", "qis.DoctorRequestOption",
	"qis.Passwords"})
@EnableAutoConfiguration
@EnableWebMvc
public class MainApplication implements WebMvcConfigurer {
	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
		
	}
	@Override
     public void addCorsMappings(CorsRegistry registry) {
         registry
         .addMapping("/**")
         .allowedOrigins("http://192.168.100.46:9090", "http://localhost:4200", "http://192.168.100.132:9090", "http://192.168.0.107:9090", "http://192.168.43.10:9090")
         .allowedMethods("GET", "POST", "PUT", "DELETE");
     }
	
}
