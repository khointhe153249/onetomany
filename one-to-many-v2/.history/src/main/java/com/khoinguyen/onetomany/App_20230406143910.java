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
				.emailAddress("quan@gmail.com")
				.firstName("Le")
				.lastName("Quan")
				.build();

		Person p2 = Person.builder()
				.age(20)
				.emailAddress("anh@gmail.com")
				.firstName("Nguyen")
				.lastName("Anh")
				.build();

		Address address = Address.builder()
				.address("Ha Nam")
				.build();
		// p1.setAddress(address);
		// p2.setAddress(address);

		List<Person> persons = new ArrayList<Person>();
		persons.add(p1);
		persons.add(p2);

		address.setPersons(persons);
		addressRepository.save(address);	

		// p1.setAddress(address);
		// personRepository.save(p1);
		// p2.setAddress(address);
		// personRepository.save(p2);

		// List<Address> listAddresses = addressRepository.findAll();
		// List<Person> persons = personRepository.findAll();

		// listAddresses.forEach(address -> System.out.println(address.getPersons()) );

		// persons.forEach(person -> System.out.println(person.getAddress()));

		// addressRepository.deleteById(2);
	}

}
