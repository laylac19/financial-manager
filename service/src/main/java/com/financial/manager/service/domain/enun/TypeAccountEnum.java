package com.financial.manager.service.domain.enun;

public enum TypeAccountEnum {
    CORRENTE(1, "Conta Corrente"),
    POUPANCA(2, "Conta Poupança");

    private final Integer type;
    private final String description;

    TypeAccountEnum(Integer type, String description) {
        this.type = type;
        this.description = description;
    }
}
