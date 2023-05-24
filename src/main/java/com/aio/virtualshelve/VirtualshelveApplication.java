package com.aio.virtualshelve;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.aio"})
public class VirtualshelveApplication {

	public static void main(String[] args) {
		SpringApplication.run(VirtualshelveApplication.class, args);
	}

}
