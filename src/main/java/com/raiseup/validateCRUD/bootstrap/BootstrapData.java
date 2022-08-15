package com.raiseup.validateCRUD.bootstrap;

import com.raiseup.validateCRUD.bussines.model.Person;
import com.raiseup.validateCRUD.data.PersonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Component
public class BootstrapData implements CommandLineRunner {

    private final PersonService personService;

    public BootstrapData(PersonService personService) {
        this.personService = personService;
    }

    @Override
    public void run(String... args) throws Exception {
        if(personService.count()==0){

            loadData();
        }

    }

    private void loadData() {
        List<Person> people = List.of(new Person("p1 first name", "p1 last name", LocalDate.now(), new BigDecimal("5700.00")),
                new Person("p2 first name", "p2 last name", LocalDate.now(), new BigDecimal("5000.00")),
                new Person( "p3 first name", "p3 last name", LocalDate.now(), new BigDecimal("4700.00")),
                new Person( "p4 first name", "p4 last name", LocalDate.now(), new BigDecimal("3700.00")),
                new Person( "p5 first name", "p5 last name", LocalDate.now(), new BigDecimal("2700.00")),
                new Person( "p6 first name", "p6 last name", LocalDate.now(), new BigDecimal("1700.00"))
        );

        personService.saveAll(people);
    }
}
