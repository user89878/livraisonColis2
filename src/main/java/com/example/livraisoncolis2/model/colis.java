package com.example.livraisoncolis2.model;


import javax.persistence.*;

@Entity
public class colis {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id_colis;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = " id_utilisateur")
    private User user;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_Expediteur")
    private Expediteur exp;
    private String numero_suivi;
    private String nom_distinataire;
    private String adresse_destinataire;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_ville")
    private ville ville;
    private String type_expedtion;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_statut")
    private Statut statut;
    private String tel;
    private String montant;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_remarque")
    private Remarque rmq;
    private int payant;
    @Lob
    private byte[] signature;
    @Lob
    private byte[] recu;
    private String typr_paiment;
    private String code_destinataire;
    @OneToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private journal_evenement je;
    @OneToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private lchargement Lc;
    @OneToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Paiment paiment;









}
