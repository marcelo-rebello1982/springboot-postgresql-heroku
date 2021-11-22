package com.marcelopaulo.algafood.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.checkerframework.common.aliasing.qual.Unique;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Getter
@Setter
@Table(uniqueConstraints = {@UniqueConstraint(name = "unq_cpf", columnNames = {"cpf"})})
public class Colaborador extends AbstractEntity<Long> {

    @Column(nullable = false)
    @NotBlank
    private String nome;

    @CPF
    private String cpf;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "colaborador_cafe", joinColumns = {@JoinColumn(name = "colaborador_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "cafe_id", referencedColumnName = "id")})
    private List<Cafe> cafe = new ArrayList<Cafe>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "colaborador_phone", joinColumns = {@JoinColumn(name = "colaborador_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "phone_id", referencedColumnName = "id")})
    private List<Phone> phone = new ArrayList<Phone>();

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinTable(name = "colaborador_phone", joinColumns = {@JoinColumn(name = "colaborador_Id",
//            referencedColumnName = "Id")}, inverseJoinColumns = {@JoinColumn(name = "phone_Id",
//            referencedColumnName = "Id")})
//    private Phone phone;
//
//    @OneToMany(mappedBy = "colaborador", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
//    @Column(name = "PHONES")
//    private List<Phone> phonesList = new ArrayList<>();

}
