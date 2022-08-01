package com.example.livraisoncolis2.model;

import javax.persistence.*;

@Entity
public class journal_evenement {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id_journal_event;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = " id_utilisateur")
    private User user;
    private String Date;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_colis")
    private colis coli;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_statut")
    private Statut statut;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_remarque")
    private Remarque rmq;

}
