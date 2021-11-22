package com.marcelopaulo.algafood.domain.model;

import com.marcelopaulo.algafood.core.validation.Groups;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table
@Getter
@Setter
public class Estado extends AbstractEntity<Long>{

	@NotBlank
	@Column(nullable = false, unique = true)
	private String nome;
	
}