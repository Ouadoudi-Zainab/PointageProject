package com.example.pointageproject.Data.Entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name="Personne")
@Inheritance(strategy = InheritanceType.JOINED)
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique= true)
    private Long id;
    @Column(name = "first_name")
    private String name ;
    @Column(name = "last_name")
    private String lastName ;
    @Column(name = "age")
    private String age ;
    @Column(name = "adresse")
    private String adresse;
    @Column(name = "phone_number")
    private int telephone;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;


}