package com.brunosalata.digital_bank_api.service.exception;

/**
 * @author Bruno Salata Lima
 * github.com/Brunosalata
 */
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public BusinessException(String message) {
        super(message);
    }
}
