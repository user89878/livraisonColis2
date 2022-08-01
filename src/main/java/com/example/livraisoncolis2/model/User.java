package com.example.livraisoncolis2.model;


import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id_utilisateur;
    @Column(length = 50)
    String nom;
    @Column(length = 50)
    String mdp;
    @Column(length = 60)
    String observation;
    int inactif;
    @Column(length = 50)
    String mail;
    @Column(length = 50)
    String prenom;
    @Column(length = 50)
    String num_tel;
    int livreur;
    @ManyToOne
    @JoinColumn(name = "id_Expediteur")
    private Expediteur exp;
    @Lob
    private byte[] photo;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private colis col;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private journal_evenement je;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Paiment paiment;
}

