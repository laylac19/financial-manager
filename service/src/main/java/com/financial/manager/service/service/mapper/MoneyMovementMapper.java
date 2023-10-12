package com.financial.manager.service.service.mapper;

import com.financial.manager.service.domain.MoneyMovement;
import com.financial.manager.service.service.dto.MoneyMovementDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MoneyMovementMapper extends EntityMapper<MoneyMovementDTO, MoneyMovement> {
    @Override
    @Mapping(source = "account.id", target = "accountId")
    MoneyMovementDTO toDto(MoneyMovement entity);

    @InheritInverseConfiguration
    MoneyMovement toEntity(MoneyMovementDTO dto);
}
