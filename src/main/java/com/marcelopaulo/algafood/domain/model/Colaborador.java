package com.marcelopaulo.algafood.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Colaborador {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @CPF
    private String cpf;

    @CreationTimestamp
    @Column(nullable = false, columnDefinition = "timestamp")
    private OffsetDateTime dataCadastro;

    @UpdateTimestamp
    @Column(nullable = false, columnDefinition = "timestamp")
    private OffsetDateTime dataAtualizacao;

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
