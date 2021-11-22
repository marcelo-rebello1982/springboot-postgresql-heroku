package com.marcelopaulo.algafood.domain.repository;

import com.marcelopaulo.algafood.domain.model.Colaborador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

// @Repository
public interface ColaboradorRepository extends JpaRepository<Colaborador, Long> {

    @Query("select c from Colaborador c where c.nome like %:nome%")
    Colaborador findByNome(@Param("nome") String nome);


}
