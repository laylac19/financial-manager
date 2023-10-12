package com.financial.manager.service.domain.pk;

import jakarta.persistence.Column;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode()
public class MovementApplicationPK implements Serializable {

    @Column(name = "ID_APPLICATION")
    private Long applicationId;

    @Column(name = "ID_MONEY_MOVEMENT")
    private Long movementId;
}
