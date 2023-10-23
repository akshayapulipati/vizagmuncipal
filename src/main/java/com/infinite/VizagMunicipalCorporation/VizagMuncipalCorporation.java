package com.infinite.VizagMunicipalCorporation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class VizagMuncipalCorporation {
	public static void main(String[] args) {
		SpringApplication.run(VizagMuncipalCorporation.class, args);
	}

}
