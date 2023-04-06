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

		Person p1 = Person.builder()
				.age(20)
				.emailAddress("khoi@gmail.com")
				.firstName("khoi")
				.lastName("nguyen")
				.build();

				Person p1 = Person.builder()
				.age(20)
				.emailAddress("khoi@gmail.com")
				.firstName("khoi")
				.lastName("nguyen")
				.build();

		List<Person> persons = new ArrayList<Person>();
		persons.add(p1);

		Address address = Address.builder()
				.address("Ha Nam")
				.persons(persons)
				.build();
		addressRepository.save(address);

		person.setAddress(address);
		personRepository.save(person);
	}

}
