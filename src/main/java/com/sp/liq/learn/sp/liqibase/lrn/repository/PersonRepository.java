package com.sp.liq.learn.sp.liqibase.lrn.repository;

import com.sp.liq.learn.sp.liqibase.lrn.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepository extends JpaRepository<Person,Integer> {
}
