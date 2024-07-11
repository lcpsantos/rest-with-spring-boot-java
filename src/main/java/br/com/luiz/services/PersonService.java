package br.com.luiz.services;

import br.com.luiz.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonService.class.getName());

    public List<Person> findAll() {
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            var person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }

    public Person findById(String id) {

        logger.info("Find one person!");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Luiz");
        person.setLastName("Pacheco");
        person.setAddress("Betim - Minas Gerais - Brasil");
        person.setGender("Male");

        return person;
    }

    public Person create(Person person) {

        logger.info("Create one person!");

        return person;
    }
    public Person update(Person person) {

        logger.info("Create one person!");

        return person;
    }

    public void delete(String id) {

        logger.info("Delete one person!");
    }

    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Person Name " + i);
        person.setLastName("Last Name " + i);
        person.setAddress("Some Address in Brasil " + i);
        person.setGender("Male");

        return person;
    }
}
