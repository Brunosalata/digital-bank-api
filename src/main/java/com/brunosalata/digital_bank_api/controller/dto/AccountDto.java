package com.brunosalata.digital_bank_api.controller.dto;

import com.brunosalata.digital_bank_api.domain.model.Account;

import java.math.BigDecimal;

/**
 * @author Bruno Salata Lima
 * github.com/Brunosalata
 */
public record AccountDto(Long id, String number, String agency, BigDecimal balance, BigDecimal limit) {

    public AccountDto(Account model) {
        this(model.getId(), model.getNumber(), model.getAgency(), model.getBalance(), model.getLimit());
    }

    public Account toModel() {
        Account model = new Account();
        model.setId(this.id);
        model.setNumber(this.number);
        model.setAgency(this.agency);
        model.setBalance(this.balance);
        model.setLimit(this.limit);
        return model;
    }
}
