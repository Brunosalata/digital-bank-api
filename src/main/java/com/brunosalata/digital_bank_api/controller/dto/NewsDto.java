package com.brunosalata.digital_bank_api.controller.dto;

import com.brunosalata.digital_bank_api.domain.model.News;

/**
 * @author Bruno Salata Lima
 * github.com/Brunosalata
 */
public record NewsDto(Long id, String icon, String description) {

    public NewsDto(News model) {
        this(model.getId(), model.getIcon(), model.getDescription());
    }

    public News toModel() {
        News model = new News();
        model.setId(this.id);
        model.setIcon(this.icon);
        model.setDescription(this.description);
        return model;
    }
}
