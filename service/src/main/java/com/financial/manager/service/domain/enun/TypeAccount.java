package com.financial.manager.service.domain.enun;

public enum TypeAccount {
    CORRENTE(1, "Conta Corrente"),
    POUPANCA(2, "Conta Poupança");

    private final Integer type;
    private final String description;

    TypeAccount(Integer type, String description) {
        this.type = type;
        this.description = description;
    }
}
