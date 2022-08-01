package com.example.livraisoncolis2.model;


import javax.persistence.*;

@Entity
public class Remarque {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id_remarque;
    @Column(length = 50)
    String libelle;
    @OneToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private colis coli;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private journal_evenement je;


}
