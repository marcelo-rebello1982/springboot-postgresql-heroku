package com.marcelopaulo.algafood.domain.repository;

import com.marcelopaulo.algafood.domain.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

// @Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long> {

}
