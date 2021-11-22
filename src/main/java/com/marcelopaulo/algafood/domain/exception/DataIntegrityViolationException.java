package com.marcelopaulo.algafood.domain.exception;

import org.springframework.dao.NonTransientDataAccessException;

public class DataIntegrityViolationException extends NegocioException {

    public DataIntegrityViolationException(String msg) {
        super(msg);
    }
    public DataIntegrityViolationException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
