package com.cjc.app.hl.master.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.CrossOrigin;
@EnableEurekaClient
@SpringBootApplication
@CrossOrigin("*")
public class HomeLoanMasterModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeLoanMasterModuleApplication.class, args);
	}

}
