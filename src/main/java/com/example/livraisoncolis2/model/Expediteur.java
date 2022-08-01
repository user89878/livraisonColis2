package com.example.livraisoncolis2.model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Expediteur")
public class Expediteur {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id_Expediteur")
    Long id_Expediteur;
    @Column(length = 50)
    String nom;
    @Column(length = 50)
    String num_tel;
    @Column(length = 50)
    String addres;
    @Column(length = 50)
    String email;
    int inactif;
    @OneToMany
    private Set<User> recordings = new HashSet<>();
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private colis coli;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Paiment paiment;


}
