package com.marcelopaulo.algafood.domain.repository;

import com.marcelopaulo.algafood.domain.model.Permissao;
import org.springframework.data.jpa.repository.JpaRepository;

// @Repository
public interface PermissaoRepository extends JpaRepository<Permissao, Long> {

}
