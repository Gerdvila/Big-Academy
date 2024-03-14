package com.example.rest.controller;

import com.example.rest.model.domain.Person;
import com.example.rest.model.exception.NoPersonFoundException;
import com.example.rest.model.request.PersonRequest;
import com.example.rest.model.response.PersonResponse;
import com.example.rest.service.PersonService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/persons")
@Tag(name = "Person Controller", description = "Provides service with person data")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping()
    @Operation(summary = "Get person Data")
    public List<Person> getPersons(@RequestParam(required = false) String firstName, @RequestParam(required = false) String lastName){
        return personService.getPersons(firstName, lastName);
    }

    @GetMapping(value = "/{id}")
    public PersonResponse getPersonById(@PathVariable Long id) {
        return personService.getPersonById(id);
    }

    @PostMapping()
    @Operation(summary = "Save person data")
    public Person savePerson(@Validated @RequestBody PersonRequest personRequest) {
        return personService.createPerson(personRequest);
    }

    @PatchMapping(value = "/{id}/update")
    public Person updatePerson(@PathVariable Long id, @Validated @RequestBody PersonRequest personRequest) throws NoPersonFoundException {
        try {
            return personService.updatePerson(id, personRequest);
        } catch (NoPersonFoundException e) {
            throw new NoPersonFoundException("Person with id " + id + " not found");
        }
    }

    @DeleteMapping(value = "/{id}/delete")
    public Person deletePerson(@PathVariable Long id) throws NoPersonFoundException {
        try {
            return personService.deletePerson(id);
        } catch (NoPersonFoundException e) {
            throw new NoPersonFoundException("Person with id " + id + " not found");
        }
    }
}


