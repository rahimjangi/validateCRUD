package com.raiseup.validateCRUD.web.controller;

import com.raiseup.validateCRUD.bussines.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/people")
public class PeopleController {


    @GetMapping
    public String getPeople(Model model){
        List<Person> personList = null;
        model.addAttribute("people",personList);
        return "people";
    }
}
