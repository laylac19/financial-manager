package com.financial.manager.service.domain.enun;

public enum TypeMovementEnum {
    SAIDA(1, "Saída Conta"),
    ENTRADA(2, "Entrada Conta"),
    CREDITO(3, "Compra Cartão"),
    RENDIMENTO(4, "Rendimento Aplicação"),
    RESGATE(5, "Resgate Aplicação"),
    GUARDAR(6, "Guardar Aplicação");

    private final Integer type;
    private final String description;

    TypeMovementEnum(Integer type, String description) {
        this.type = type;
        this.description = description;
    }
}
