package com.sp.liq.learn.sp.liqibase.lrn.entity;

import jakarta.persistence.*;
import lombok.*;





@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    @Setter
    private String name;


}
