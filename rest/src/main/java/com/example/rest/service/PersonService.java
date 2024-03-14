package com.example.rest.service;

import com.example.rest.model.domain.Person;
import com.example.rest.model.exception.NoPersonFoundException;
import com.example.rest.model.request.PersonRequest;
import com.example.rest.model.response.PersonResponse;
import com.example.rest.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getPersons(String firstName, String lastName) {
        if (firstName != null && !firstName.isBlank()) {
            return personRepository.findAllByFirstName(firstName);
        }
        if (lastName != null && !lastName.isBlank()) {
            return personRepository.findAllByLastName(lastName);
        }
        return personRepository.findAll();
    }

    public PersonResponse getPersonById(Long id) throws NoPersonFoundException {
        Person person = personRepository.findById(id).get();
        return convertPersonToPersonResponse(person);
    }


    public Person createPerson(PersonRequest request) {
        Person person = convertPersonRequestToPerson(request);
        return personRepository.save(person);
    }

    public Person updatePerson(Long id, PersonRequest request) throws NoPersonFoundException{
          Optional<Person> person = personRepository.findById(id);
            if (person.isPresent()) {
                Person updatedPerson = person.get();
                updatedPerson.setFirstName(request.firstName());
                updatedPerson.setLastName(request.lastName());
                updatedPerson.setEmail(request.email());
                updatedPerson.setPhone(request.phone());
                return personRepository.save(updatedPerson);
            } else {
                throw new NoPersonFoundException("Person with id " + id + " not found");
        }
    }

    public Person deletePerson(Long id) throws NoPersonFoundException {
        Optional<Person> person = personRepository.findById(id);
        if (person.isPresent()) {
            personRepository.deleteById(id);
            return person.get();
        } else {
            throw new NoPersonFoundException("Person with id " + id + " not found");
        }
    }

    private PersonResponse convertPersonToPersonResponse(Person person) {
        return person == null
                ? null
                : new PersonResponse(person.getFirstName(),
                person.getLastName(),
                person.getEmail(),
                person.getPhone());
    }

    private Person convertPersonRequestToPerson(PersonRequest request) {
        return request == null
                ? null
                : Person.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .phone(request.phone())
                .build();
    }

}
