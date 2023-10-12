package com.financial.manager.service.service.mapper;

import com.financial.manager.service.domain.Account;
import com.financial.manager.service.service.dto.AccountDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AccountMapper extends EntityMapper<AccountDTO, Account> {

    @Override
    @Mapping(source = "bank.id", target = "bankId")
    AccountDTO toDto(Account entity);

    @InheritInverseConfiguration
    Account toEntity(AccountDTO dto);
}
