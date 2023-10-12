package com.financial.manager.service.domain;

import com.financial.manager.service.domain.enun.CreditCardEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

@Entity
@Getter
@Setter
@Table(name = "TB_CARD_INVOICE")
@NoArgsConstructor
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_invoice")
    @SequenceGenerator(name = "sequence_invoice", allocationSize = 1, sequenceName = "sequence_invoice")
    @Column(name = "ID")
    private Long id;

    @Column(name = "MONTH", nullable = false)
    private Month month;

    @Column(name = "VALUE", precision = 19, scale = 2)
    private BigDecimal value;

    @Enumerated
    @Column(name = "CREDIT_CARD ENUM", nullable = false, unique = true)
    private CreditCardEnum creditCardEnum;

    @Column(name = "ACTIVE", nullable = false)
    private Boolean active;

    public Invoice(Long id, String month, BigDecimal value, CreditCardEnum creditCard, Boolean active) {
        this.id = id;
        this.month = LocalDate.now().getMonth();
        this.value = value;
        this.creditCardEnum = creditCard;
        this.active = active;
    }
}
