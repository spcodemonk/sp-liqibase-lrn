package com.sp.liq.learn.sp.liqibase.lrn.service;

import com.sp.liq.learn.sp.liqibase.lrn.entity.Person;
import com.sp.liq.learn.sp.liqibase.lrn.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class PersonService {

    private PersonRepository personRepository;
    public Person savePerson(){

        Person p = new Person();
        p.setName("Ashok");

        return personRepository.save(p);

    }
}
