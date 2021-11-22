package com.marcelopaulo.algafood.domain.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.apachecommons.CommonsLog;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@CommonsLog
@NoArgsConstructor
@MappedSuperclass
public abstract class AbstractEntity<Long> implements Serializable {

    public static final String GENERATOR = "custom_sequence";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GENERATOR)
    protected Long Id;

    @CreationTimestamp
    @Column(nullable = false, columnDefinition = "timestamp")
    private OffsetDateTime dataCadastro;

    @UpdateTimestamp
    @Column(nullable = false, columnDefinition = "timestamp")
    private OffsetDateTime dataAtualizacao;

    @Version
    @Column(name = "version")
    private int version;
}