package com.marcelopaulo.algafood.domain.model;

import lombok.*;
import lombok.extern.apachecommons.CommonsLog;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;


@MappedSuperclass
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public abstract class AbstractEntity<Long> implements Serializable {

    public static final String GENERATOR = "custom_sequence";

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GENERATOR)
    protected Long id;

    @CreationTimestamp
    @Column(nullable = false, columnDefinition = "timestamp")
    private OffsetDateTime dataCadastro;

    @UpdateTimestamp
    @Column(nullable = false, columnDefinition = "timestamp")
    private OffsetDateTime dataAtualizacao;

    @Version
    @Column(name = "version")
    private int version;


    //    @JsonIgnore
//    @CreationTimestamp
//    @Column(nullable = false, columnDefinition = "timestamp")
//    private LocalDateTime dataCadastro;
//
//    @JsonIgnore
//    @UpdateTimestamp
//    @Column(nullable = false, columnDefinition = "timestamp")
//    private LocalDateTime dataAtualizacao;

}
