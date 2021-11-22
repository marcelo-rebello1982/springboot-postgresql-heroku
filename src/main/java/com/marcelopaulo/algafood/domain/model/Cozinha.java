package com.marcelopaulo.algafood.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.marcelopaulo.algafood.core.validation.Groups;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Getter
@Setter
public class Cozinha extends AbstractEntity<Long> {

	@NotNull(groups = Groups.CozinhaId.class)

	//@JsonProperty(value = "titulo")
	// @JsonIgnore
	@NotBlank
	@Column(nullable = false)
	private String nome;
	
	@JsonIgnore
	@OneToMany(mappedBy = "cozinha")
	private List<Restaurante> restaurantes = new ArrayList<>();
	
}
