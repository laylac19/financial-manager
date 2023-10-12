package com.financial.manager.service.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class ApplicationDTO {

    private Long id;

    private String description;

    private Long accountId;

    private BigDecimal value;

}
