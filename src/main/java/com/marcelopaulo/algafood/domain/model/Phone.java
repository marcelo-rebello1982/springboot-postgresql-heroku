package com.marcelopaulo.algafood.domain.model;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.marcelopaulo.algafood.enumeration.TelephoneType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.extern.apachecommons.CommonsLog;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@CommonsLog
@NoArgsConstructor
@Entity
//@NamedQueries({
//        @NamedQuery(name = "phone.findAll", query = "SELECT p FROM PHONE p"),
//        @NamedQuery(name = "phone.findNameByID", query = "SELECT p FROM PHONE p WHERE p.id = :colaborador_id")})
public class Phone {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(length = 3, nullable = false, unique = false)
    private Integer ddd;

    @Column(nullable = false, unique = false, length = 50)
    private String numero;

    @Column(length = 50, nullable = true, unique = false)
    private String operadora;

    @Enumerated(EnumType.STRING)
    private TelephoneType telephoneTypes;

    @JsonIgnore
    @ManyToMany(mappedBy = "phone")
    private List<Colaborador> colaborador;


}
