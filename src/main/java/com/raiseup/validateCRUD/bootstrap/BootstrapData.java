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

//            loadData();
        }

    }

    private void loadData() {
        List<Person> people = List.of(
                new Person("p1 first name", "p1 last name", LocalDate.now(), "mymail@raiseup.com",new BigDecimal("5700.00")),
                new Person("p2 first name", "p2 last name", LocalDate.now(), "mymail@raiseup.com",new BigDecimal("5000.00")),
                new Person( "p3 first name", "p3 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("4700.00")),
                new Person( "p4 first name", "p4 last name", LocalDate.now(), "mymail@raiseup.com",new BigDecimal("3700.00")),
                new Person( "p5 first name", "p5 last name", LocalDate.now(), "mymail@raiseup.com",new BigDecimal("2700.00")),
                new Person( "p6 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p7 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p8 first name", "p6 last name", LocalDate.now(), "mymail@raiseup.com",new BigDecimal("1700.00")),
                new Person( "p9 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p10 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p11 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p12 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p13 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p14 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p15 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p16 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p17 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p18 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p19 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p20 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p21 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p22 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p23 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p24 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p25 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p26 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p27 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p28 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p29 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p30 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person("p31 first name", "p1 last name", LocalDate.now(), "mymail@raiseup.com",new BigDecimal("5700.00")),
                new Person("p32 first name", "p2 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("5000.00")),
                new Person( "p33 first name", "p3 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("4700.00")),
                new Person( "p34 first name", "p4 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("3700.00")),
                new Person( "p35 first name", "p5 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("2700.00")),
                new Person( "p36 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p37 first name", "p6 last name", LocalDate.now(), "mymail@raiseup.com",new BigDecimal("1700.00")),
                new Person( "p38 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p39 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p40 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p41 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p42 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p43 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p44 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p45 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p46 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p47 first name", "p6 last name", LocalDate.now(), "mymail@raiseup.com",new BigDecimal("1700.00")),
                new Person( "p48 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p49 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p50 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p51 first name", "p6 last name", LocalDate.now(), "mymail@raiseup.com",new BigDecimal("1700.00")),
                new Person( "p52 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p53 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p54 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p55 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p56 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p57 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p58 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p59 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00")),
                new Person( "p60 first name", "p6 last name", LocalDate.now(),"mymail@raiseup.com", new BigDecimal("1700.00"))
        );

        personService.saveAll(people);
    }
}
