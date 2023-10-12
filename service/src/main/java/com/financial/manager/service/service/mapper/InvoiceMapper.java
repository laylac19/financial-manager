package com.financial.manager.service.service.mapper;

import com.financial.manager.service.domain.Invoice;
import com.financial.manager.service.service.dto.InvoiceDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InvoiceMapper extends EntityMapper<InvoiceDTO, Invoice> {
}
