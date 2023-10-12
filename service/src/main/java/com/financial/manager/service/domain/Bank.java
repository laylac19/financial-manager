package com.financial.manager.service.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "TB_BANK")
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_bank")
    @SequenceGenerator(name = "sequence_bank", allocationSize = 1, sequenceName = "sequence_bank")
    @Column(name = "ID")
    private Long id;

    @Column(name = "DESCRIPTION", nullable = false)
    private String description;
}
