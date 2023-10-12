package com.financial.manager.service.service.dto;

import com.financial.manager.service.domain.enun.TypeMovementEnum;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class FixedExpensesDTO extends MoneyMovementDTO {

    private LocalDate payDay;

    private Integer expenseStatusId;

    public FixedExpensesDTO(Long id, String description, BigDecimal value, LocalDate dateMovement, TypeMovementEnum typeMovementId, Long accountId) {
        super(id, description, value, dateMovement, typeMovementId, accountId);
    }
}
