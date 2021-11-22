package com.marcelopaulo.algafood.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.List;

@Entity
@Table
@Getter
@Setter

 // https://github.com/gilsonsilvati/algaworks-ecommerce/blob/master/src/main/java/com/algaworks/ecommerce/model/Produto.java
public class Cafe extends AbstractEntity<Long> {

    @Column(name = "tipo")
    private String tipo;

    @JsonIgnore
    @ManyToMany(mappedBy = "cafe")
    private List<Colaborador> colaborador;


}
