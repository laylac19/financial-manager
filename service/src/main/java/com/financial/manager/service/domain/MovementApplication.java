package com.financial.manager.service.domain;

import com.financial.manager.service.domain.pk.MovementApplicationPK;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "TB_MOVEMENT_APPLICATION")
@IdClass(MovementApplicationPK.class)
@NoArgsConstructor
public class MovementApplication {

    @Id
    @Column(name = "ID_APPLICATION")
    private Long applicationId;

    @Id
    @Column(name = "ID_MONEY_MOVEMENT")
    private Long movementId;

    @ManyToOne(cascade = CascadeType.MERGE, optional = false)
    @JoinColumn(name = "ID_APPLICATION", referencedColumnName = "id", nullable = false, unique = true)
    private Application application;

    @ManyToOne(cascade = CascadeType.MERGE, optional = false)
    @JoinColumn(name = "ID_MONEY_MOVEMENT", nullable = false, unique = true)
    private MoneyMovement moneyMovement;
}
