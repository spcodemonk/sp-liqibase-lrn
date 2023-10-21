package com.sp.liq.learn.sp.liqibase.lrn.app;

import com.sp.liq.learn.sp.liqibase.lrn.entity.Person;
import com.sp.liq.learn.sp.liqibase.lrn.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
@RequestMapping("/person")
public class PersonController {

    private PersonService personService;
    @GetMapping("/save")
    public Person getData(){
        return personService.savePerson();
    }
}
