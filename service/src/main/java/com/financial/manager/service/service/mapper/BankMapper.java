package com.financial.manager.service.service.mapper;

import com.financial.manager.service.domain.Bank;
import com.financial.manager.service.service.dto.BankDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BankMapper extends EntityMapper<BankDTO, Bank> {

}
