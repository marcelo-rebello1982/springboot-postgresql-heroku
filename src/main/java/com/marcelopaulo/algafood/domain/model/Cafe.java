package com.marcelopaulo.algafood.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.List;

@Entity @Data
public class Cafe {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipo")
    private String tipo;

    @CreationTimestamp
    @Column(nullable = false, columnDefinition = "timestamp")
    private OffsetDateTime dataCadastro;

    @UpdateTimestamp
    @Column(nullable = false, columnDefinition = "timestamp")
    private OffsetDateTime dataAtualizacao;

    @JsonIgnore
    @ManyToMany(mappedBy = "cafe")
    private List<Colaborador> colaborador;


//    @ManyToOne
//    @JoinColumn(nullable = false)
//    private Colaborador colaborador;
//



}
