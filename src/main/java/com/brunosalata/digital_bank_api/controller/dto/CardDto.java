package com.brunosalata.digital_bank_api.controller.dto;

import com.brunosalata.digital_bank_api.domain.model.Card;

import java.math.BigDecimal;

/**
 * @author Bruno Salata Lima
 * github.com/Brunosalata
 */
public record CardDto(Long id, String number, BigDecimal limit) {

    public CardDto(Card model) {
        this(model.getId(), model.getNumber(), model.getLimit());
    }

    public Card toModel() {
        Card model = new Card();
        model.setId(this.id);
        model.setNumber(this.number);
        model.setLimit(this.limit);
        return model;
    }
}
