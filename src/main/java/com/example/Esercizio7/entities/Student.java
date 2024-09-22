package com.example.Esercizio7.entities;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table (name = "students")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false)
    private String lastName;
    @Column (nullable = false)
    private String firstName;
    @Column (nullable = false, unique = true)
    private String Email;
}
