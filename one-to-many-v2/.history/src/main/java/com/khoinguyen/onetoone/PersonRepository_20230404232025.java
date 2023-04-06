package com.khoinguyen.onetoone;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonRepository extends JpaRepository<Person, Integer> {

    public List<Person> findByFirstName(String firstName);

    public List<Person> findByFirstNameContaining(String firstName);

    @Query("SELECT p FROM Person p WHERE firstName = ?1 OR lastName = ?1")
    public List<Person> findByFirstNameOrLastNameContaining(String key);
}
