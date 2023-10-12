package com.financial.manager.service.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Table(name = "TB_APPLICATION")
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_application")
    @SequenceGenerator(name = "sequence_application", allocationSize = 1, sequenceName = "sequence_application")
    @Column(name = "ID")
    private Long id;

    @Column(name = "DESCRIPTION", nullable = false)
    private String description;

    @ManyToOne(cascade = CascadeType.MERGE, optional = false)
    @JoinColumn(name = "ACCOUNT_ID", nullable = false)
    private Account account;

    @Column(name = "VALUE", nullable = false)
    private BigDecimal value;

}
