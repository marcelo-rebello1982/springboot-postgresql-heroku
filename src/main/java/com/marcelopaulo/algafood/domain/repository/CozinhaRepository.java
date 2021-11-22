package com.marcelopaulo.algafood.domain.repository;

import com.marcelopaulo.algafood.domain.model.Cozinha;

import java.util.List;
import java.util.Optional;

// @Repository
public interface CozinhaRepository extends CustomJpaRepository<Cozinha, Long> {

	List<Cozinha> findTodasByNomeContaining(String nome);
	
	Optional<Cozinha> findByNome(String nome);
	
	boolean existsByNome(String nome);
	
}
