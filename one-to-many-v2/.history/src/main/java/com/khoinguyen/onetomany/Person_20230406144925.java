package com.khoinguyen.onetomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "person")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int age;

    private String emailAddress;

    private String firstName;

    private String lastName;

    @ManyToOne
    @JoinColumn(name = "address_id")
    @ToString.Exclude
    private Address address;
}
