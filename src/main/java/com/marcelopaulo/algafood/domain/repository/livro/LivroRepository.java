package com.marcelopaulo.algafood.domain.repository.livro;

import com.marcelopaulo.algafood.domain.model.livro.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

}
