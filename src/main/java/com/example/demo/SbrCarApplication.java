package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SbrCarApplication {

	private static final Logger logger = LoggerFactory.getLogger(SbrCarApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SbrCarApplication.class, args);
		
		logger.info("Car App started ! Goto http://localhost:8081/m1glsi_mouhamednaby_ndoye");
		
		
	}

	@RestController
	@RequestMapping("m1glsi_mouhamednaby_ndoye")
	public class SbrCarController {
		@Value("${fullname:Mouhamed Naby Ndoye}")
		private String fullname;

		@GetMapping
		public String getFullname() {
			return "Work done by " + this.fullname + "!";
		}
	}

	


}

