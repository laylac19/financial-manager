package com.financial.manager.service.service.dto;

import com.financial.manager.service.domain.enun.TypeAccountEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class AccountDTO implements Serializable {

    private Long id;

    private String description;

    private TypeAccountEnum typeAccount;

    private Double balance;

    private Long bankId;

}