package com.khoinguyen.onetoone;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {

    public List<Person> findByFirstName(String firstName);
}
