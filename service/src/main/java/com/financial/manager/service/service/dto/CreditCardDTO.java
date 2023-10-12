package com.financial.manager.service.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class CreditCardDTO {

    private Long id;

    private String name;

    private BigDecimal limit;

    private LocalDate closingDate;

    private LocalDate dueDate;

    private Long accountId;

}
