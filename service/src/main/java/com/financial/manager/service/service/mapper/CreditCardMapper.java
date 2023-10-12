package com.financial.manager.service.service.mapper;

import com.financial.manager.service.domain.CreditCard;
import com.financial.manager.service.service.dto.CreditCardDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CreditCardMapper extends EntityMapper<CreditCardDTO, CreditCard> {
    @Override
    @Mapping(source = "account.id", target = "accountId")
    CreditCardDTO toDto(CreditCard entity);

    @InheritInverseConfiguration
    CreditCard toEntity(CreditCardDTO dto);
}
