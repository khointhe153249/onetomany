package com.khoinguyen.onetoone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(App.class, args);

		PersonRepository repository = context.getBean(PersonRepository.class);
		for (int i = 0; i < 100; i++) {
			Person person = Person.builder()
							.firstName("firstName "+i)
							.lastName("lastName "+i)
							
							.build();
		}

	}

}
