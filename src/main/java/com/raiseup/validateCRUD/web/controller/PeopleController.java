package com.raiseup.validateCRUD.web.controller;

import com.raiseup.validateCRUD.bussines.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/people")
public class PeopleController {


    @GetMapping
    public String getPeople(Model model){
        List<Person> personList = List.of(new Person(1L, "p1 first name", "p1 last name", LocalDate.now(), new BigDecimal("5700.00")),
                new Person(2L, "p2 first name", "p2 last name", LocalDate.now(), new BigDecimal("5000.00")),
                new Person(3L, "p3 first name", "p3 last name", LocalDate.now(), new BigDecimal("4700.00")),
                new Person(4L, "p4 first name", "p4 last name", LocalDate.now(), new BigDecimal("3700.00")),
                new Person(5L, "p5 first name", "p5 last name", LocalDate.now(), new BigDecimal("2700.00")),
                new Person(6L, "p6 first name", "p6 last name", LocalDate.now(), new BigDecimal("1700.00"))
        );
        model.addAttribute("people",personList);
        return "people";
    }
}
