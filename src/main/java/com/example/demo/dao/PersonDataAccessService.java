package com.example.demo.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.example.demo.model.Person;

import org.springframework.stereotype.Repository;

@Repository("MySQL")
public class PersonDataAccessService implements PersonDao {

    @Override
    public int insertPerson(UUID id, Person person) {
        return 0;
    }

    @Override
    public List<Person> selectAllPeople() {
        // Can use List.of(new ... DB")) in java 9+
        return Stream.of(new Person(UUID.randomUUID(), "From MySQL DB"))
        .collect(Collectors.toList());
    }

    @Override
    public Optional<Person> seleclPersonById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deletePersonById(UUID id) {
        return 0;
    }

    @Override
    public int updatePersonById(UUID id, Person person) {
        return 0;
    }

}