package com.example.livraisoncolis2.model;

import javax.persistence.*;

@Entity
public class ville {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id_ville;
    String libelle;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private colis coli;
}
