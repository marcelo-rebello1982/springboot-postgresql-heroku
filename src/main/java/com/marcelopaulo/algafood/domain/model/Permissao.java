package com.marcelopaulo.algafood.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
public class Permissao extends AbstractEntity<Long> {

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String descricao;

}