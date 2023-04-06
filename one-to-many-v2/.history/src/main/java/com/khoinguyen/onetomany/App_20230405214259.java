package com.khoinguyen.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(App.class, args);

		PersonRepository personRepository = context.getBean(PersonRepository.class);
		AddressRepository addressRepository = context.getBean(AddressRepository.class);

		Address address = Address.builder()
				.address("Ha Nam")
				.build();

		Person person = Person.builder()
				.age(20)
				.emailAddress("khoi@gmail.com")
				.firstName("khoi")
				.lastName("nguyen")
				.address(address)
				.build();

		List<Person> persons = new ArrayList<Person>();
		li

		addressRepository.save(address);
	}

}
