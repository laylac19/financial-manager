package com.financial.manager.service.service;

import com.financial.manager.service.domain.Account;
import com.financial.manager.service.repository.AccountRepository;
import com.financial.manager.service.service.dto.AccountDTO;
import com.financial.manager.service.service.mapper.AccountMapper;
import com.financial.manager.service.utils.ExceptionMessageUtil;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.ws.rs.BadRequestException;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class AccountService {
    private final AccountMapper mapper;
    private final AccountRepository repository;

    private final BankService bankService;

    private Account findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new BadRequestException(ExceptionMessageUtil.ENTITY_NOT_FOUND));
    }

    public AccountDTO getById(Long id) {
        return mapper.toDto(findById(id));
    }

    public AccountDTO insert(AccountDTO dto) {
        bankService.getById(dto.getBankId());
        Account entity = repository.save(mapper.toEntity(dto));
        return mapper.toDto(entity);
    }

    public List<AccountDTO> getAll() {
        return mapper.toDtoList(repository.findAllByActiveIsTrue());
    }

    public void deativate(Long id) {
        repository.deactivateAccount(id);
    }

}