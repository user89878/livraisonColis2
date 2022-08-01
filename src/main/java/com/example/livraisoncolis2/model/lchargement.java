package com.example.livraisoncolis2.model;

import javax.persistence.*;

@Entity
public class lchargement {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id_chargemet;
    private Integer nligne;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_colis")
    private colis coli;

}
