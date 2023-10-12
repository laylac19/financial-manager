package com.financial.manager.service.domain;

import com.financial.manager.service.domain.enun.TypeMovementEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "TB_MONEY_MOVEMENT")
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
public class MoneyMovement {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_account")
    @SequenceGenerator(name = "sequence_account", allocationSize = 1, sequenceName = "sequence_account")
    @Column(name = "ID")
    private Long id;

    @Column(name = "DESCRIPTION", nullable = false)
    private String description;

    @Column(name = "VALUE", nullable = false)
    private BigDecimal value;

    @Column(name = "DATE_MOVEMENT", nullable = false)
    private LocalDate dateMovement;

    @Enumerated
    @Column(name = "TYPE_MOVEMENT", nullable = false)
    private TypeMovementEnum typeMovement;

    @ManyToOne(cascade = CascadeType.MERGE, optional = false)
    @JoinColumn(name = "ACCOUNT_ID", nullable = false)
    private Account account;

    @Column(name = "ACTIVE", nullable = false)
    private Boolean active;

}
