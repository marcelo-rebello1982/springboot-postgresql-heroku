package com.marcelopaulo.algafood.api.controller;

import com.marcelopaulo.algafood.domain.model.livro.Livro;
import com.marcelopaulo.algafood.domain.service.CadastroLivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/livros")
public class LivroController {

    @Autowired
    private CadastroLivroService cadastroLivroService;

    @GetMapping
    public List<Livro> findAll() {
        return cadastroLivroService.findAll();
    }
}
