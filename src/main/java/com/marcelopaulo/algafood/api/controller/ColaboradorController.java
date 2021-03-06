package com.marcelopaulo.algafood.api.controller;


import com.marcelopaulo.algafood.domain.exception.*;
import com.marcelopaulo.algafood.domain.model.Colaborador;
import com.marcelopaulo.algafood.domain.model.Cozinha;
import com.marcelopaulo.algafood.domain.repository.ColaboradorRepository;
import com.marcelopaulo.algafood.domain.service.ColaboradorService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/colaborador")
public class ColaboradorController {


    @Autowired
    private ColaboradorRepository colaboradorRepository;

    @Autowired
    private ColaboradorService colaboradorService;

    @GetMapping("/findAll")
    public List<Colaborador> listar() {
        return colaboradorService.findAll();
    }


    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Colaborador save(@RequestBody @Valid Colaborador colaborador) {
        return colaboradorService.save(colaborador);
    }

    @DeleteMapping("/delete/{colaboradorId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long colaboradorId) {
        colaboradorService.delete(colaboradorId);
    }

    @PutMapping("/update/{colaboradorId}")
    public Colaborador update(@PathVariable Long colaboradorId,
                              @RequestBody @Valid Colaborador colaborador) {
        Colaborador colaboradorAtual = colaboradorService.findByID(colaboradorId);
        BeanUtils.copyProperties(colaborador, colaboradorAtual, "id");
        return colaboradorService.save(colaboradorAtual);
    }

    @GetMapping("findById/{colaboradorId}")
    public Colaborador findByID(@PathVariable Long colaboradorId) {
        return colaboradorService.findByID(colaboradorId);
    }

}
