package com.financial.manager.service.service.dto;

import com.financial.manager.service.domain.enun.TypeMovementEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class MoneyMovementDTO {

    private Long id;

    private String description;

    private BigDecimal value;

    private LocalDate dateMovement;

    private TypeMovementEnum typeMovementId;

    private Long accountId;

}
