package it.ntt.hellospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellospringbootApplication {

	public static void main(String[] args) {

		System.out.println("ciao a tutti");
		SpringApplication.run(HellospringbootApplication.class, args);
	}

}
