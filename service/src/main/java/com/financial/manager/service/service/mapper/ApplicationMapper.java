package com.financial.manager.service.service.mapper;

import com.financial.manager.service.domain.Application;
import com.financial.manager.service.service.dto.ApplicationDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ApplicationMapper extends EntityMapper<ApplicationDTO, Application> {
    @Override
    @Mapping(source = "account.id", target = "accountId")
    ApplicationDTO toDto(Application entity);

    @InheritInverseConfiguration
    Application toEntity(ApplicationDTO dto);
}
