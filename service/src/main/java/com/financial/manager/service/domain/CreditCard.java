package com.financial.manager.service.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "TB_CREDIT_CARD")
public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_card")
    @SequenceGenerator(name = "sequence_card", allocationSize = 1, sequenceName = "sequence_card")
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "LIMIT", nullable = false)
    private BigDecimal limit;

    @Column(name = "CLOSING_DATE", nullable = false)
    private LocalDate closingDate;

    @Column(name = "DUE_DATE", nullable = false)
    private LocalDate dueDate;

    @ManyToOne(cascade = CascadeType.MERGE, optional = false)
    @JoinColumn(name = "ACCOUNT_ID", nullable = false)
    private Account account;

    @Column(name = "ACTIVE", nullable = false)
    private Boolean active;

}
