package com.khoinguyen.onetoone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import lombok.NoArgsConstructor;

@SpringBootApplication
@NoArgsConstructor
public class App {
	private final PersonRepository personRepository;
	private final AddressRepository addressRepository;

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(App.class, args);

		Address address = Address.builder()
				.address("Ha Nam")
				.build();
		addressRepository.save(address);

		Person person = Person.builder()
				.age(20)
				.emailAddress("khoi@gmail.com")
				.firstName("khoi")
				.lastName("nguyen")
				.address(address)
				.build();
		personRepository.save(person);
	}

}
