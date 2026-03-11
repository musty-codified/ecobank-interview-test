package com.ecobank.ecobank.services.impl;

import com.ecobank.ecobank.dto.TransferDto;
import com.ecobank.ecobank.services.AccountService;

public class AccountServiceImpl implements AccountService {
    @Override
    public void validateAccount(TransferDto request) {

        if (request.getSender().equals(request.getBeneficiary())){
            throw new RuntimeException("Sender and Beneficiary cannot be the same account");
        }


    }
}
