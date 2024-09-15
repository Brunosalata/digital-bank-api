package com.brunosalata.digital_bank_api.service.exception;

/**
 * @author Bruno Salata Lima
 * github.com/Brunosalata
 */
public class NotFoundException extends BusinessException {

    private static final long serialVersionUID = 1L;

    public NotFoundException() {
        super("Resource not found.");
    }

}
