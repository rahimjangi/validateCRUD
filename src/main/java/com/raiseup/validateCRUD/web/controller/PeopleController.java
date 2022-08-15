package com.raiseup.validateCRUD.web.controller;

import com.raiseup.validateCRUD.bussines.model.Person;
import com.raiseup.validateCRUD.data.PersonService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/people")
public class PeopleController {
    private final PersonService personService;

    public PeopleController(PersonService personService) {
        this.personService = personService;
    }


    @GetMapping
    public String getPeople(
            @RequestParam(defaultValue = "0",name = "page") int page,
            @RequestParam(defaultValue = "15",name = "size") int size,
            Model model){
        List<Person> personList = new ArrayList<>();
        try{
            Pageable pageable= PageRequest.of(page,size);
            Page<Person> personPage;
            personPage= personService.findAll(pageable);
            personList=personPage.getContent();
            model.addAttribute("totalPages",personPage.getTotalPages());
            model.addAttribute("totalObjects",personPage.getTotalElements());
            model.addAttribute("currentPage",personPage.getNumber());
            model.addAttribute("people",personList);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "people";
    }
}
