package com.marcelopaulo.algafood.domain.model;

import javax.persistence.*;

@Table(name = "login")
@Entity
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "usuario", nullable = false, unique = true)
    private String usuario;
}