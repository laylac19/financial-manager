package com.financial.manager.service.domain;

import com.financial.manager.service.domain.enun.ExpenseStatusEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "TB_FIXED_EXPENSES")
public class FixedExpenses extends MoneyMovement {

    @Column(name = "PAY_DAY", nullable = false)
    private LocalDate payDay;

    @Enumerated
    @Column(name = "EXPENSE_STATUS", nullable = false)
    private ExpenseStatusEnum expenseStatus;

    @Column(name = "ACTIVE", nullable = false)
    private Boolean active;

}
