package com.example.livraisoncolis2.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Paiment {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id_paiment;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_utilisateur")
    private User user;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_colis")
    private colis coli;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_Expediteur")
    private Expediteur expediteur;
    @DateTimeFormat(pattern = "dd/mm/yyyy")
    private java.util.Date Date;
    private String referance;
    private Integer montant;
    @Lob
    private byte[] recu;




}
