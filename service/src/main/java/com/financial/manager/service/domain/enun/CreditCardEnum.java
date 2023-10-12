package com.financial.manager.service.domain.enun;

public enum CreditCardEnum {
    NUBANK(1, "Nubank"),
    INTER(2, "Inter"),
    ITAU(3, "Itaú");

    private final Integer type;
    private final String description;

    CreditCardEnum(Integer type, String description) {
        this.type = type;
        this.description = description;
    }
}
