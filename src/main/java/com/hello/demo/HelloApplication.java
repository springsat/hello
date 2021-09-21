package com.hello.demo;







import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class HelloApplication {
	@Test
	void contextLoads() {
		
	}
	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

}
