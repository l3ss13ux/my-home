package com.example.myhome.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "ANNONCE")
public class Annonce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String titre;
    @Column
    @Enumerated(EnumType.STRING)
    private Ville ville;
    @Column
    private Integer codePostal;
    @Column
    private float prix;
    @Column
    private String description;
    @Column
    private boolean favori;
    @Column
    private String image;

    public Annonce(){}

    public Integer getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public Ville getVille() {
        return ville;
    }

    public Integer getCodePostal() {
        return codePostal;
    }

    public float getPrix() {
        return prix;
    }

    public String getDescription() {
        return description;
    }

    public boolean getFavori() {
        return favori;
    }

    public String getImage() {
        return image;
    }
}
