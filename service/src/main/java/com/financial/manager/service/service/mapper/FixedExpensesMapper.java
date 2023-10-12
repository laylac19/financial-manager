package com.financial.manager.service.service.mapper;

import com.financial.manager.service.domain.FixedExpenses;
import com.financial.manager.service.service.dto.FixedExpensesDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FixedExpensesMapper extends EntityMapper<FixedExpensesDTO, FixedExpenses> {
}
