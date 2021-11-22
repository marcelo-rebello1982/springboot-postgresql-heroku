package com.marcelopaulo.algafood.domain.repository;

import com.marcelopaulo.algafood.domain.model.FormaPagamento;
import org.springframework.data.jpa.repository.JpaRepository;

// @Repository
public interface FormaPagamentoRepository extends JpaRepository<FormaPagamento, Long> {

}
