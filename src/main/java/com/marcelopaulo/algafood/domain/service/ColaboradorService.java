package com.marcelopaulo.algafood.domain.service;

import com.marcelopaulo.algafood.domain.exception.CidadeNaoEncontradaException;
import com.marcelopaulo.algafood.domain.exception.ColaboradorNaoEncontradoException;
import com.marcelopaulo.algafood.domain.exception.ConstraintViolationException;
import com.marcelopaulo.algafood.domain.exception.EntidadeEmUsoException;
import com.marcelopaulo.algafood.domain.model.Cidade;
import com.marcelopaulo.algafood.domain.model.Colaborador;
import com.marcelopaulo.algafood.domain.model.Cozinha;
import com.marcelopaulo.algafood.domain.model.Estado;
import com.marcelopaulo.algafood.domain.repository.ColaboradorRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

@Service
public class ColaboradorService {

    private static final String MSG_COLABORADOR_EM_USO
            = "Colaborador de código %d não pode ser removido, pois está em uso";

    @Autowired
    private ColaboradorRepository colaboradorRepository;


    public Colaborador findByID(Long colaboradorId) {
        return colaboradorRepository.findById(colaboradorId)
                .orElseThrow(() -> new ColaboradorNaoEncontradoException(colaboradorId));
    }

    public Colaborador save(Colaborador colaborador) {
        try {
            return colaboradorRepository.save(colaborador);
        } catch (DataIntegrityViolationException ex) {
            throw new ConstraintViolationException(
                    String.format("CPF JÁ CADASTRADO"), null, ex.getCause().toString());
        }
    }

    public void delete(Long colaboradorId) {
        try {
            colaboradorRepository.deleteById(colaboradorId);
        } catch (EmptyResultDataAccessException e) {
            throw new ColaboradorNaoEncontradoException(colaboradorId);
        } catch (DataIntegrityViolationException e) {
            throw new EntidadeEmUsoException(
                    String.format(MSG_COLABORADOR_EM_USO, colaboradorId));
        }
    }

    public List<Colaborador> findAll() {
        return colaboradorRepository.findAll();
    }
}
