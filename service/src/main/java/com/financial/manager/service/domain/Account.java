package com.financial.manager.service.domain;

import com.financial.manager.service.domain.enun.TypeAccount;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "TB_ACCOUNT")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_account")
    @SequenceGenerator(name = "sequence_account", allocationSize = 1, sequenceName = "sequence_account")
    @Column(name = "ID")
    private Long id;

    @Column(name = "DESCRIPTION", nullable = false)
    private String description;

    @Enumerated
    @Column(name = "TYPE_ACCOUNT", nullable = false)
    private TypeAccount typeAccount;

    @Column(name = "BALANCE")
    private Double balance;

    @ManyToOne(cascade = CascadeType.MERGE, optional = false)
    @JoinColumn(name = "BANK_ID", nullable = false)
    private Bank bank;

}