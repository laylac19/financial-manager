package com.financial.manager.service.service;

import com.financial.manager.service.domain.Bank;
import com.financial.manager.service.repository.BankRepository;
import com.financial.manager.service.service.dto.BankDTO;
import com.financial.manager.service.service.mapper.BankMapper;
import com.financial.manager.service.utils.ExceptionMessageUtil;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.ws.rs.BadRequestException;

@Service
@Transactional
@RequiredArgsConstructor
public class BankService {

    private final BankMapper mapper;
    private final BankRepository repository;

    private Bank findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new BadRequestException(ExceptionMessageUtil.ENTITY_NOT_FOUND));
    }

    public BankDTO getById(Long id) {
        return mapper.toDto(findById(id));
    }
}
