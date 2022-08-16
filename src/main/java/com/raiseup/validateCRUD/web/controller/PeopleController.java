package com.raiseup.validateCRUD.web.controller;

import com.raiseup.validateCRUD.bussines.model.Person;
import com.raiseup.validateCRUD.data.PersonService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/people")
public class PeopleController {
    private final PersonService personService;

    public PeopleController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/api")
    public ResponseEntity<Map<String,Object>> getPeopleList(@RequestParam(name = "page",defaultValue = "0")int page,
                                                      @RequestParam(name = "size",defaultValue = "15") int size){
        Map<String,Object> response= new HashMap<>();
        try{
            Pageable pageable= PageRequest.of(page,size);
            Page<Person> personPage = personService.findAll(pageable);
            response.put("totalPages",personPage.getTotalPages());
            response.put("totalObjects",personPage.getTotalElements());
            response.put("currentPage",personPage.getNumber());
            response.put("people",personPage.getContent());
            return new ResponseEntity<Map<String,Object>>(response, HttpStatus.OK);
        }catch (Exception ex){
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping
    public String getPeoplePage(
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

    @PostMapping
    public String savePerson(Person person){
        personService.save(person);
        return "redirect:/people";
    }

    @ModelAttribute
    public Person person(){
        return new Person();
    }

}
