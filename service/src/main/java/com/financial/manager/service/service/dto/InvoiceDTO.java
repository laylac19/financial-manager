package com.financial.manager.service.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Month;

@Getter
@Setter
@AllArgsConstructor
public class InvoiceDTO {

    private Long id;

    private Month month;

    private BigDecimal value;

    private Integer creditCardId;

    private Boolean active;
}
