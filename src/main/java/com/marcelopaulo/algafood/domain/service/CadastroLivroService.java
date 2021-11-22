package com.marcelopaulo.algafood.domain.service;

import com.marcelopaulo.algafood.domain.model.livro.Livro;
import com.marcelopaulo.algafood.domain.repository.livro.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadastroLivroService {

    @Autowired
    private LivroRepository livroRepository;

    public List<Livro> findAll() {
        return livroRepository.findAll();
    }
}
