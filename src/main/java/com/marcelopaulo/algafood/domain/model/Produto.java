package com.marcelopaulo.algafood.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table
@Getter
@Setter
// https://github.com/gilsonsilvati/algaworks-ecommerce/blob/master/src/main/java/com/algaworks/ecommerce/model/Produto.java

public class Produto extends AbstractEntity<Long> {

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private BigDecimal preco;

    @Column(nullable = false)
    private Boolean ativo;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Restaurante restaurante;

}