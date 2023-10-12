package com.financial.manager.service.domain.enun;

public enum ExpenseStatusEnum {
    EM_ABERTO(1, "Em Aberto"),
    RENDENDO(2, "Rendendo"),
    PAGO(3, "Pago");

    private final Integer type;
    private final String description;

    ExpenseStatusEnum(Integer type, String description) {
        this.type = type;
        this.description = description;
    }
}
